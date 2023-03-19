package solver;

import maze.MazeUI;
import maze.Maze;

public class MazeSolver {

	public static int getInteger() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		return in.nextInt();
	}
	
	public static void main(String[] args) {
		
		// Maze m = new Maze();		
		Maze maze = MazeUI.getMazeWithGUI();
		
		while(true) {
			System.out.println(maze);
		
			boolean front = maze.isOpenFront();
			boolean left = maze.isOpenLeft();
			boolean right = maze.isOpenRight();
			
			System.out.println("Left="+left+" Front="+front+" Right="+right);
					
			int command = getInteger();
			switch(command) {
			case 0: // Move Forward
				maze.moveForward();
				break;
			case 1:
				maze.turnCounterClockwise();
				break;
			case 2:
				maze.turnClockwise();
				break;
			}
		}

	}
	
	// Make this MAIN for auto-solving
	public static void mainAUTO(String [] args) {
		
		Maze maze = MazeUI.getMazeWithGUI();
		
		while(true) {
			if(maze.isOpenLeft()) {
				// Left is open ... turn and go left
				maze.turnCounterClockwise();
				maze.moveForward();
			} else if(maze.isOpenFront()) {
				// Forward is open ... go forward
				maze.moveForward();
			} else {
				// Left and forward blocked
				maze.turnClockwise();
			}
		}
	}	

}
