package solver;

import maze.MazeUI;
import maze.Maze;

public class MazeSolver {

	public static void main(String[] args) throws Exception {
		
		Maze m = MazeUI.getMazeWithGUI();
		for(int i=0;i<8;++i) {
			Thread.sleep(1000);
			m.turnClockwise();
		}
		
		// TODO stuff with m

	}

}
