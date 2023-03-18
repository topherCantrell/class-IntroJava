
public class TextHuman extends Player {
    
    /**
     * This creates a new player.
     * @param isPlayerOne true if player one (or false for 2)
     */
    public TextHuman(boolean isPlayerOne) {
        super(isPlayerOne);
    }
    
    @SuppressWarnings("resource")
    static int readInt() {
        return new java.util.Scanner(System.in).nextInt();       
    }

	@Override
	public int getMove(Board board) {
		while(true) {
            if(isOne) {
                System.out.println("Your move player 1 (0..8)");
            } else {
                System.out.println("Your move player 2 (0..8)");
            }
            int move = readInt();
            if(move>=0 && move<=8 && board.getCellState(move)==0) {
                return move;
            }
            System.out.println("Invalid move. Try again.");
        }
	}

}
