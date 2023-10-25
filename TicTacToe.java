package BasicProgram;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}

	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkRows() {
		char temp = ' ';
		for (int i = 0; i < board.length; i++) {
			temp = board[i][0];
			if (temp != EMPTY) {
				for (int j = 0; j < board.length; j++) {
					if (board[i][j] != temp) {
						break;
					}
					if (j == board.length) {
						if (temp == 'X') {
							System.out.print("X win row");
						} else if (temp == 'O') {
							System.out.print("O win row");
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * This method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 */
	public boolean checkColumns() {
		char temp = ' ';
		for (int i = 0; i < board.length; i++) {
			temp = board[0][i];
			if (temp != EMPTY) {
				for (int j = 0; j < board.length; j++) {
					if (board[j][i] != temp) {
						break;
					}
					if (j == board.length) {
						if (temp == 'X') {
							System.out.print("X win col");
						} else if (temp == 'O') {
							System.out.print("O win col");
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 * This method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkDiagonals() {
		// Check top-left to bottom-right
		char temp = board[0][0];
		if(temp != EMPTY) {
			for (int i = 1; i < board.length; i++) {
				if(board[i][i] != temp) {
					break;
				}
				if (i == board.length-1) {
					if (temp == 'X') {
						System.out.print("X win diag");
					} else if (temp == 'O') {
						System.out.print("O win diag");
					}
					return true;
				}
			}
		}
		// Check bottom-left to top-right
			temp = board[0][board.length-1];
			if(temp != EMPTY) {
				for(int i = board.length-2;i>=0; i--) {
					if(board[i][board.length-1-i]!= temp) {
						break;
					}
					if(i==0) {
						if (temp == 'X') {
							System.out.print("X win diag");
						} else if (temp == 'O') {
							System.out.print("O win diag");
						}
						return true;
					}
				}
			}
		return false;
	}

	public static void main(String[] args) {
		char[][] c1 = { { 'X', 'X', 'X' }, { ' ', 'O', ' ' }, { 'O', ' ', ' ' } };
		char[][] c2 = { { 'O', 'X', 'O' }, { 'O', 'X', 'X' }, { 'O', ' ', ' ' } };
		char[][] c3 = { { 'X', 'O', 'X' }, { ' ', 'X', ' ' }, { 'O', ' ', 'X' } };
		TicTacToe tacToe = new TicTacToe(c1);
		TicTacToe tacToe2 = new TicTacToe(c2);
		TicTacToe tacToe3 = new TicTacToe(c3);
		tacToe.checkRows();
		System.out.println("---------------------");
		tacToe2.checkColumns();
		System.out.println("---------------------");
		tacToe3.checkDiagonals();
	}
}
