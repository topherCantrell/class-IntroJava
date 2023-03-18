
public class CATWoman extends Oneder {
	
	public CATWoman(boolean isPlayerOne) {
		super(isPlayerOne);
	}
	
	private int countMoves(Board board) {
		int ret = 0;
		for(int x=0;x<9;++x) {
			if(board.getCellState(x)!=0) {
				++ret;
			}
		}
		return ret;
	}

	@Override
	public int getMove(Board board) {
		
		int blockWin = super.findMove(board);
		if(blockWin!=-1) {
			return blockWin;
		}
		
		int numMoves = countMoves(board);
		
		// Number of moves:
		// 0: We go first  -- pick upper left corner (0)
		// 1: We go second -- pick center (4) if free or bottom right (8)
		// 2: We go third  -- pick center (4) if free or free corner (0,2,6,8)
		// 3: Pick random middle (1,3,5,7)
		// 4: If opponent is in 1 then take 3. If opponent is in 3 then take 6.
		
		switch(numMoves) {
		case 0:
			return 0;
		case 1:
			if(board.getCellState(4)==0) {
				return 4;
			}
			return 8;
		case 2:
			if(board.getCellState(4)==0) return 4;
			if(board.getCellState(0)==0) return 0;
			if(board.getCellState(2)==0) return 2;
			if(board.getCellState(6)==0) return 6;
			return 8;
		case 3:
			if(board.getCellState(1)==0) return 1;
			if(board.getCellState(3)==0) return 3;
			if(board.getCellState(5)==0) return 5;
			return 7;
		case 4:
			if(board.getCellState(1)!=0) return 3;
			return 6;
			
			default:
				// This is just a random move
				return super.getMove(board);
		}				
		
	}

}
