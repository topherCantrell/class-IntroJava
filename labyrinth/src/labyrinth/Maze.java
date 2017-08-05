package labyrinth;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class encapsulates a maze and a "walker" you can drive through the maze.
 * You should instantiate a new maze object and call "initialize" on it to set up
 * the walker and the exit.<p>
 * 
 * Then you can ask the maze object what the walker sees (isOpen methods). You can
 * control the walker by turning clockwise or counterclockwise and stepping forward.<p>
 * 
 * You can call "showMaze" to display the maze in a graphical window.
 */
public class Maze {
	
	private int walkerX=-1;
	private int walkerY=-1;
	private int walkerFacing=-1; // 0=North, 1=East, 2=South, 3=West
	
	private int exitX=-1;
	private int exitY=-1;	
	
	private Drawer drawer;
	
	// Hardcoded maze ... not random for now
	private final String [][] mazeData = {
			{"wn","ns","ns","ns","ns","n","wn","ne"},
			{"wne","nws","ns","n","ns","se","we","we"},
			{"ws","ns","ne","ew","nws","ne","ew","ew"},
			{"wn","ne","ew","ws","ns","e","ew","ew"},
			{"ew","ew","ws","n","nes","ws","se","ew"},
			{"ew","ws","ns","s","ne","wn","ns","se"},
			{"ws","ns","ns","ne","ews","ws","ns","ne"},
			{"nws","ns","ns","s","ns","ns","ns","se"}			
	};
	
	// The status of each cell. Individual bits represent the states of walls
	// and "been here" tracks.
	private int[][] cells = new int[8][8];	
	
	/**
	 * This constructs a new Maze object. Call "initialize" to setup the 
	 * walker and exit.
	 */
	public Maze() {
		for(int row=0;row<mazeData.length;++row) {
			for(int col=0;col<mazeData[row].length;++col) {
				String data = mazeData[row][col];
				if(data.indexOf("n")>=0) {
					cells[row][col] |= 1;
					if(row!=0) cells[row-1][col] |= 4;
				}
				if(data.indexOf("w")>=0) {
					cells[row][col] |= 8;
					if(col>0) cells[row][col-1] |= 2;					
				}
				if(data.indexOf("s")>=0) {
					cells[row][col] |= 4;
					if(row<7) cells[row+1][col] |= 1;
				}
				if(data.indexOf("e")>=0) {
					cells[row][col] |= 2;
					if(col<7) cells[row][col+1] |= 8;
				}
								
			}
		}				
				
	}
	
	/**
	 * This method returns the top level frame of the showing application
	 * or null if there isn't one showing.
	 * @return the parent frame or null
	 */
	public JFrame getJFrame() {
		if(drawer==null) {
			return null;
		}
		return (JFrame) drawer.getParent();
	}
	
	/**
	 * This method opens a graphical view of the maze in a separate window.
	 * @return 
	 */
	public JFrame showMaze() {
		
		// Just one
		if(drawer!=null) return null;
		
		JFrame frame = new JFrame("Labyrinth");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawer = new Drawer();
		drawer.setPreferredSize(new Dimension(401,401));
		frame.getContentPane().add(drawer, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
		//frame.setAlwaysOnTop(true);
		drawer.getParent();
		
		return frame;
		
	}
	
	/**
	 * This method initializes (or reinitializes) the walker and exit to
	 * random spots in the maze.
	 */
	public void initialize() {
		Random rand = new Random();
		walkerX = rand.nextInt(8);
		walkerY =  rand.nextInt(8);
		walkerFacing = rand.nextInt(4);
		
		exitX = rand.nextInt(8);
		exitY = rand.nextInt(8);
		
	}
	
	/**
	 * This method returns true if the walker is at the exit.
	 * @return true if the walker is at the exit or false if not
	 */
	public boolean isWalkerAtExit() {
		if(walkerX==exitX && walkerY==exitY) return true;
		return false;
	}
	
	/**
	 * This method returns true if the walker can step forward.
	 * @return true if the front wall is open
	 */
	public boolean isForwardOpen() {
		int data = cells[walkerY][walkerX];
		switch(walkerFacing) {
		case 0:
			if((data&1)==0) return true;
			return false;
		case 1:
			if((data&2)==0) return true;
			return false;
		case 2:
			if((data&4)==0) return true;
			return false;
		case 3:
			if((data&8)==0) return true;
			return false;
		}
		return true;
	}
	
	/**
	 * This method returns true if the walker can go to his left.
	 * @return true if the left facing wall is open
	 */
	public boolean isLeftOpen() {
		int fh = walkerFacing;
		--walkerFacing;
		if(walkerFacing<0) walkerFacing=3;
		boolean ret = isForwardOpen();
		walkerFacing = fh;
		return ret;
	}
	
	/**
	 * This method returns true if the walker can go to his right.
	 * @return true if the right facing wall is open
	 */
	public boolean isRightOpen() {
		int fh = walkerFacing;
		++walkerFacing;
		if(walkerFacing>3) walkerFacing=0;
		boolean ret = isForwardOpen();
		walkerFacing = fh;
		return ret;
	}
		
	/**
	 * This method turns the walker clockwise to face the wall to
	 * his right.
	 */
	public void turnClockwise() {
		walkerFacing = walkerFacing + 1;
		if(walkerFacing>3) walkerFacing = 0;
		
		if(drawer!=null) {
			drawer.updateUI();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	/**
	 * This method turns the walker counter-clockwise to face the wall to
	 * his left.
	 */
	public void turnCounterClockwise() {
		walkerFacing = walkerFacing - 1;
		if(walkerFacing<0) walkerFacing = 3;
		
		if(drawer!=null) {
			drawer.updateUI();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	/**
	 * This method steps the walker forward if the path is open.
	 */
	public void stepForward() {
		
		if(!isForwardOpen()) return;
		
		cells[walkerY][walkerX] |= 16;
		
		switch(walkerFacing) {
		case 0:
			--walkerY;
			break;
		case 1:
			++walkerX;
			break;
		case 2:
			++walkerY;
			break;
		case 3:
			--walkerX;
			break;
		}
				
		if(drawer!=null) {
			drawer.updateUI();
		}
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
	
	// GUI renderer
	private class Drawer extends JPanel {
		
		private static final long serialVersionUID = 1L;

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2 = (Graphics2D) g;			
			
			for(int row=0;row<cells.length;++row) {
				for(int col=0;col<cells[row].length;++col) {
					
					int dat = cells[row][col];
					
					if((dat&1)!=0) g2.drawLine(col*50,row*50,col*50+50,row*50);
					if((dat&2)!=0) g2.drawLine(col*50+50,row*50,col*50+50,row*50+50);
					if((dat&4)!=0) g2.drawLine(col*50,row*50+50,col*50+50,row*50+50);
					if((dat&8)!=0) g2.drawLine(col*50,row*50,col*50,row*50+50);
					
					if((dat&16)!=0) g2.fillRect(col*50+20,row*50+20,10,10);
					
					if(col==walkerX && row==walkerY) {
						
						switch(walkerFacing) {
						case 0:
							g2.drawLine(col*50+25,row*50+40,col*50+25,row*50+10);
							g2.fillOval(col*50+25-5,row*50+10-5,10,10);
							break;
						case 1:
							g2.drawLine(col*50+10,row*50+25,col*50+40,row*50+25);
							g2.fillOval(col*50+40-5,row*50+25-5,10,10);
							break;
						case 2:
							g2.drawLine(col*50+25,row*50+40,col*50+25,row*50+10);
							g2.fillOval(col*50+25-5,row*50+40-5,10,10);
							break;
						case 3:
							g2.drawLine(col*50+10,row*50+25,col*50+40,row*50+25);
							g2.fillOval(col*50+10-5,row*50+25-5,10,10);
							break;
						}
												
					}
					
					if(col==exitX && row==exitY) {
						g2.drawRect(col*50+10,row*50+10,30,30);
					}					
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) throws Exception 
	{
		
		Maze maze = new Maze();
		maze.initialize();
		/*JFrame jf = */maze.showMaze();
		//jf.setAlwaysOnTop(true);	
		
		while(true) {
			
			// If we are done then stop
			if(maze.isWalkerAtExit()) {
				System.out.println("I am out!");
				break;
			}
			
			// If our left hand is on an open then go that way
			if(maze.isLeftOpen()) {
				maze.turnCounterClockwise();
				maze.stepForward();
				continue;
			}
						
			// If we are blocked then turn to the right until there is
			// an open. This keeps our left hand on the wall.
			while(!maze.isForwardOpen()) {
				maze.turnClockwise();				
			}
			
			// Forward
			maze.stepForward();
			
		}
						
	}

}
