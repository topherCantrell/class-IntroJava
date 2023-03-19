package maze;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * The Maze is 10x10 grid of cells. There is one player and one exit. 
 * The player faces up, right, down, or left.
 * 
 * Use the "isOpen" methods to see the adjacent cells beside the player. 
 * Use the "turn" methods to rotate the player. Use the "move" method 
 * to move the player.
 */
public class Maze {
    
	Point player;
	Point exit;
    int dir;
    
    boolean gotOut;
    
    ActionListener uiUpdater;
    
    private Random rand = new Random();
    
    private static final int[][] DIR_OFFS = { {0,-1}, {1,0}, {0,1}, {-1,0} };
    
    private static final String CHARS = " #$@********************";
    
    private static final String[] MAZEWALLS = {
      "XXXXXXXXXX",
      "X X      X",
      "X X XXXXXX",
      "X X      X",
      "X X X XXXX",
      "X   X X  X",
      "XXX X X XX",
      "X X X X XX",
      "X   X    X",
      "XXXXXXXXXX"            
    };
    
    int cells[][] = new int[10][10];
        
    /**
     * This constructs a new random maze ready for solving.
     */
    public Maze() {
    	newMaze();        
    }
    
    private Point randomFree() {
    	while(true) {
    		int x = rand.nextInt(10);
    		int y = rand.nextInt(10);
    		if(cells[y][x]==0) {
    			return new Point(x,y);
    		}
    	}
    	
    }
    
    /**
     * This method reinitializes the maze to a random configuration and places
     * the player and the exit in random cells.
     */
    public void newMaze() {
    	int row = 0;
    	int rowDelta = 1;
    	int col = 0;    	
    	int colDelta = 1;
    	
    	if(rand.nextBoolean()) {
    		row = 9;
    		rowDelta = -1;
    	}
    	
    	if(rand.nextBoolean()) {
    		col = 9;
    		colDelta = -1;
    	}
    	
    	int cy = 0;
    	int cx = 0;
    	int colStart = col;    	
    	while(row>=0 && row<10) {
    		String s = MAZEWALLS[row];
    		while(col>=0 && col<10) {
    			char c = s.charAt(col);
    			if(c=='X') {
    				cells[cy][cx] = 1;
    			} else {
    				cells[cy][cx] = 0;
    			}
    			cx = cx + 1;
    			col = col + colDelta;
    		}
    		cx = 0;
    		col = colStart;
    		row = row + rowDelta;
    		cy = cy + 1;
    	}
    	
    	dir = rand.nextInt(4);
    	
    	player = randomFree();
    	cells[player.y][player.x] = dir*5+4;
    	
    	exit = randomFree();
    	cells[exit.y][exit.x] = 2;    	
    	
    	gotOut = false;
    	
    	if(uiUpdater!=null) {
        	uiUpdater.actionPerformed(null);
        }
    	
    }
    
    @Override
    public String toString() {
    	StringBuffer ret = new StringBuffer();
    	for(int y=0;y<10;++y) {
    		for(int x=0;x<10;++x) {
    			ret.append(CHARS.charAt(cells[y][x]));    			
    		}
    		ret.append('\n');
    	}
    	return ret.toString();
    }    
    
    private void delay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method returns true if the cell to the player's left is open.
     * @return true if open or false if a wall
     */
    public boolean isOpenLeft() {    	
    	int d = dir-1;
    	if(d<0) d=3;
    	if(d>3) d=0;
    	int cx = player.x + DIR_OFFS[d][0];
    	int cy = player.y + DIR_OFFS[d][1];
    	if(cells[cy][cx]!=1) return true;
        return false;
    }
    
    /**
     * This method returns true if the cell to the player's right is open.
     * @return true if open or false if a wall
     */
    public boolean isOpenRight() {
    	int d = dir+1;
    	if(d<0) d=3;
    	if(d>3) d=0;
    	int cx = player.x + DIR_OFFS[d][0];
    	int cy = player.y + DIR_OFFS[d][1];
    	if(cells[cy][cx]!=1) return true;
        return false;
    }
    
    /**
     * This method returns true if the cell in front of the player is open.
     * @return true if open of false if a wall
     */
    public boolean isOpenFront() {    	
    	int cx = player.x + DIR_OFFS[dir][0];
    	int cy = player.y + DIR_OFFS[dir][1];
    	if(cells[cy][cx]!=1) return true;
        return false;
    }
    
    /**
     * This method moves the player forward one square if the square is open.
     * If the cell is a wall then the player does not move.
     */
    public void moveForward() {    	
        
        if(gotOut) {
        	System.out.println("You are out of the maze!");
        	return;
        }
        
        int cx = player.x + DIR_OFFS[dir][0];
    	int cy = player.y + DIR_OFFS[dir][1];
    	if(cells[cy][cx]!=1) {
    	    
    	    cells[player.y][player.x] = 4+dir*5+3;
    	    if(uiUpdater!=null) {
                uiUpdater.actionPerformed(null);
            }
    	    delay();
    	    
    	    cells[player.y][player.x] = 0;
            player.x = cx;
            player.y = cy;
    		if(cells[cy][cx]==2) {
    			gotOut = true;
    			cells[cy][cx]=3;    	
    			System.out.println("You are out of the maze!");
    		} else {    		    
    		    cells[player.y][player.x] = 4+dir*5;
    		}
    		if(uiUpdater!=null) {
                uiUpdater.actionPerformed(null);
            }
    		delay();
    	} else {
    	    cells[player.y][player.x] = 4+dir*5+4;
            if(uiUpdater!=null) {
                uiUpdater.actionPerformed(null);
            }
            delay();
            
    		cells[player.y][player.x] = 4+dir*5;  
    		if(uiUpdater!=null) {
                uiUpdater.actionPerformed(null);
            }
            delay();
    	}
        
    }
    
    /**
     * This method rotates the player clockwise.
     */
    public void turnClockwise() {
            
    	if(gotOut) {
        	System.out.println("You are out of the maze!");
        	return;
        }
        
        cells[player.y][player.x] = 4+dir*5+1;
        if(uiUpdater!=null) {
            uiUpdater.actionPerformed(null);
        }
        delay(); 
        
        dir = dir + 1;
        if(dir>3) {
        	dir = 0;
        }
        cells[player.y][player.x] = 4+dir*5;
        if(uiUpdater!=null) {
            uiUpdater.actionPerformed(null);
        }
        delay();
    }
    
    /**
     * This method rotates the player counter-clockwise.
     */
    public void turnCounterClockwise() {
           
    	if(gotOut) {
        	System.out.println("You are out of the maze!");
        	return;
        }
        
        cells[player.y][player.x] = 4+dir*5+2;
        if(uiUpdater!=null) {
            uiUpdater.actionPerformed(null);
        }
        delay(); 
        
        dir = dir - 1;
        if(dir<0) {
        	dir = 3;
        }
        cells[player.y][player.x] = 4+dir*5;
        if(uiUpdater!=null) {
        	uiUpdater.actionPerformed(null);
        }
        delay();
    }

}
