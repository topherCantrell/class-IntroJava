
/**
 * This class manages the state of a game.
 */
public class Board {
    
    private int [] cells; // The 9 cells 0..8
    private int whoseTurn; // Whose turn is it?
    
    public Board() {
        cells = new int[9];
        whoseTurn = 1; // Player one goes first
    }
   
    /**
     * This method returns the state of a cell
     * @param coord the coordinate 0..8
     * @return 0=empty, 1=player1, 2=player2
     */
    public int getCellState(int coord) {// FIXME add code
        return cells[coord]; 
    }
    
    /**
     * This method makes a move for the next player
     * @param coord the coordinate 0..8
     */
    public void makeMove(int coord) {
    	if(cells[coord]!=0) {
    		// In case some of the computer-player logic goes astray
    		throw new RuntimeException("Cell '"+coord+"' already has a move in it.");
    	}
        cells[coord] = whoseTurn;
        if(whoseTurn==1) {
            whoseTurn = 2;
        } else {
            whoseTurn = 1;
        }
    }
    
    /**
     * This method returns true if the game has been won
     * @return true if last player to move has won
     */
    public boolean isWin() {
    	// 012
    	// 345
    	// 678
    	for(int x=1;x<3;++x) {
	        if(cells[0]==x && cells[1]==x && cells[2]==x) return true;
	        if(cells[3]==x && cells[4]==x && cells[5]==x) return true;
	        if(cells[6]==x && cells[7]==x && cells[8]==x) return true;
	        if(cells[0]==x && cells[3]==x && cells[6]==x) return true;
	        if(cells[1]==x && cells[4]==x && cells[7]==x) return true;
	        if(cells[2]==x && cells[5]==x && cells[8]==x) return true;
	        if(cells[0]==x && cells[4]==x && cells[8]==x) return true;
	        if(cells[2]==x && cells[4]==x && cells[6]==x) return true;
    	}
        return false;
    }
    
    /**
     * This method returns true if the board has no more moves
     * @return true if the game is a tie
     */
    public boolean isTie() {
        for(int x=0;x<9;++x) {
            if(cells[x]==0) return false;
        }
        return true;
    }
    
    private char tr(int value) {
        switch(value) {
        case 0: return ' ';
        case 1: return 'X';
        case 2: return 'O';
        }
        return '?';
    }

    /**
     * Display the game board on the screen in ASCII Art.
     */
    public void show() {
       System.out.println(tr(cells[0])+"|"+tr(cells[1])+"|"+tr(cells[2]));
       System.out.println("-+-+-");
       System.out.println(tr(cells[3])+"|"+tr(cells[4])+"|"+tr(cells[5]));
       System.out.println("-+-+-");
       System.out.println(tr(cells[6])+"|"+tr(cells[7])+"|"+tr(cells[8]));
    }

}
