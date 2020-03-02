
public class PlayTicTacToe {
	
	public static void main(String [] args) {
		
		// You can force the input arguments for debugging like this.
		//String [] targs = {"CATWoman", "CATWoman"};
		//args = targs;
		
		if(args.length!=2) {
			System.out.println("Give two players: Human, MrRandom, Oneder, CATWoman");
			return;
		}
		
		Board board = new Board();          // One board
		Player [] players = new Player[2];  // Two players
		
		// Build the players
		for(int x=0;x<2;++x) {
			String p = args[x].toUpperCase();
			switch(p) {
			case "HUMAN":
				players[x] = new TextHuman(x==0);
				break;
			case "MRRANDOM":
				players[x] = new MrRandom(x==0);
				break;
			case "ONEDER":
				players[x] = new Oneder(x==0);
				break;
			case "CATWOMAN":
				players[x] = new CATWoman(x==0);
				break;
				default:
					System.out.println("Invalid player '"+p+"'");
					return;
			}
		}
		
		outer:
		while(true) { // As long as the game is going on
			for(int x=0;x<2;++x) { // Each player one after the other
				board.show();
				int move = players[x].getMove(board);
				board.makeMove(move);
				
				if(board.isWin()) {
					System.out.println("You won player "+(x+1));
					board.show();
					break outer;
				}
				
				if(board.isTie()) {
					System.out.println("The game is a draw.");
					board.show();
					break outer;
				}
				
			}
		}
	}

}
