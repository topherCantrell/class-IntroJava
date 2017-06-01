
public class Oneder extends MrRandom {
	
	// This is a list of all winning combinations.
	static int [][] WINS = {
			{0,1,2},
			{3,4,5},
			{6,7,8},
			{0,3,6},
			{1,4,7},
			{2,5,8},
			{0,4,8},
			{2,4,6}
	};
	
	public Oneder(boolean isPlayerOne) {
		super(isPlayerOne);
	}
	
	// This utility function checks a combination-triple looking for one
	// cell being empty and the other two containing the "others" value.
	// This is how we find winning moves and blocking moves.
	private int checkTwoOne(Board board, int [] move, int others) {
		
		// First cache the states of the three cells in question
		int a = board.getCellState(move[0]);
		int b = board.getCellState(move[1]);
		int c = board.getCellState(move[2]);
		
		// Look for blank and others
		if(a==0 && b==others && c==others) return move[0];
		if(a==others && b==0 && c==others) return move[1];
		if(a==others && b==others && c==0) return move[2];		
		
		// No match. Return -1
		return -1;
	}
	
	// The CATWoman player uses this too.
	protected int findMove(Board board) {
		// What is our token (us) and what is the "other" token (them).
		int us = 2;
		int them = 1;
		if(isOne) {
			us = 1;
			them = 2;
		}
		
		// First look ahead to see if we can win.
		for(int [] move : WINS) {
			int m = checkTwoOne(board,move,us);
			if(m>=0) return m;
		}
		
		// We can't win. Next look ahead to see if we can block.
		for(int [] move : WINS) {
			int m = checkTwoOne(board,move,them);
			if(m>=0) return m;
		}
		
		return -1;
	}
		
	@Override
	public int getMove(Board board) {
		
		int m = findMove(board);
		if(m!=-1) return m;
		
		// No wins, no blocks -- return a random move.
		return super.getMove(board);
	}

}
