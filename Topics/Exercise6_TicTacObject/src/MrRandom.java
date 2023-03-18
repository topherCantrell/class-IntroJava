import java.util.Random;

public class MrRandom extends Player {
	
	Random rand = new Random();
	
	public MrRandom(boolean isPlayerOne) {
		super(isPlayerOne);
	}

	@Override
	public int getMove(Board board) {		
		while(true) {
			int move = rand.nextInt(9);
			if(board.getCellState(move)==0) {
				return move;
			}			
		}		
	}

}
