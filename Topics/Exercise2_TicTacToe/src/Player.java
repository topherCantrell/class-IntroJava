
/**
 * This class interacts with the player (real or computer).
 */
public class Player {
    
    boolean isOne;
    
    /**
     * This creates a new player.
     * @param isPlayerOne true if player one (or false for 2)
     */
    public Player(boolean isPlayerOne) {
        isOne = isPlayerOne;
    }
    
    @SuppressWarnings("resource")
    static int readInt() {
        return new java.util.Scanner(System.in).nextInt();       
    }
    
    /**
     * This method returns the player's valid move on the given board.
     * This method must NOT make an invalid move.
     * @param board the game board object
     * @return the move coordinate 0..8
     */
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
