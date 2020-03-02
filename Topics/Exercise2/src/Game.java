
public class Game {
    
    public static void main(String [] args) {
        
        Board board = new Board();
        
        Player p1 = new Player(true);
        Player p2 = new Player(false);  
              
        while(true) {
            if(board.isTie()) {
                break;
            }
            board.show();
            int move = p1.getMove(board);
            board.makeMove(move);
            if(board.isWin()) {
                System.out.println("YOU WIN PLAYER 1");
                break;
            }
            
            if(board.isTie()) {
                break;
            }
            board.show();
            move = p2.getMove(board);
            board.makeMove(move);
            if(board.isWin()) {
                System.out.println("YOU WIN PLAYER 1");
                break;
            }
        }
                      
    }

}
