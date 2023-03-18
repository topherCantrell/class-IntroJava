/**
 * This is the interface for a tic-tac-toe player of
 * any kind.
 */
public abstract class Player {
	
	// Most players need to know if they are player 1 or 2 so they
	// can examine the board for their next move.
	protected boolean isOne;
	
	/**
	 * This creates a player.
	 * @param isOne true if player 1 or false for player 2
	 */
	public Player(boolean isOne) {
		this.isOne = isOne;
	}
	
	/**
	 * The method returns the players next move.
	 * @param board the current board state
	 * @return the move number (0..8)
	 */
	public abstract int getMove(Board board);

}
