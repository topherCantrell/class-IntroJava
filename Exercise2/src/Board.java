
/**
 * This class manages the state of a game.
 */
public class Board {
    
    private int [] cells; // The 9 cells 0..8\
    private int whoseTurn = 1; // Player 1 goes first
    
    public Board() {
        cells = new int[9];
    }
   
    /**
     * This method returns the state of a cell
     * @param coord the coordinate 0..8
     * @return 0=empty, 1=player1, 2=player2
     */
    public int getCellState(int coord) {// FIXME add code
        return cells[coord]; 
    }
    
    /**
     * This method makes a move for the next player
     * @param coord the coordinate 0..8
     */
    public void makeMove(int coord) {   // FIXME add code
        cells[coord] = whoseTurn;
        if(whoseTurn==1) {
            whoseTurn = 2;
        } else {
            whoseTurn = 1;
        }
    }
    
    /**
     * This method returns true if the game has been won
     * @return true if last player won
     */
    public boolean isWin() {// TODO add code
        if(cells[0]==1 && cells[1]==1 && cells[2]==1) return true;
        if(cells[3]==1 && cells[4]==1 && cells[5]==1) return true;
        if(cells[6]==1 && cells[7]==1 && cells[8]==1) return true;
        
        if(cells[0]==2 && cells[1]==2 && cells[2]==2) return true;
        // More
        return false;
    }
    
    /**
     * This method returns true if the board has no more moves
     * @return true if the game is a tie
     */
    public boolean isTie() {// TODO add code
        for(int x=0;x<9;++x) {
            if(cells[x]==0) return false;
        }
        return true;
    }
    
    private char tr(int value) {
        switch(value) {
        case 0: return ' ';
        case 1: return 'X';
        case 2: return 'O';
        }
        return '?';
    }

    /**
     * Display the game board on the screen in ASCII Art.
     */
    public void show() {
       System.out.println(tr(cells[0])+"|"+tr(cells[1])+"|"+tr(cells[2]));
       System.out.println("-+-+-");
       System.out.println(tr(cells[3])+"|"+tr(cells[4])+"|"+tr(cells[5]));
       System.out.println("-+-+-");
       System.out.println(tr(cells[6])+"|"+tr(cells[7])+"|"+tr(cells[8]));
    }

}
