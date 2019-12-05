package leetcode.problems.easy;

class TicTacToe {

	public static void main(String[] args) {
		int[][] moves = new int[][] { new int[] { 0, 0 }, new int[] { 1,1 }};
		System.out.println(tictactoe(moves));
	}

	public static String tictactoe(int[][] moves) {
		String[][] board = new String[3][3];
		for (int i = 0; i < moves.length; i++) {
			if (i % 2 == 0) {
				board[moves[i][0]][moves[i][1]] = "A";
			} else {
				board[moves[i][0]][moves[i][1]] = "B";
			}
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == "A" && board[i][1] == "A" && board[i][2] == "A") {
				return "A";
			}
			if (board[i][0] == "B" && board[i][1] == "B" && board[i][2] == "B") {
				return "B";
			}
		}

		for (int i = 0; i < board.length; i++) {
			if (board[0][i] == "A" && board[1][i] == "A" && board[2][i] == "A") {
				return "A";
			}
			if (board[0][i] == "B" && board[1][i] == "B" && board[2][i] == "B") {
				return "B";
			}
		}

		if (board[0][0] == "A" && board[1][1] == "A" && board[2][2] == "A") {
			return "A";
		}
		if (board[0][2] == "A" && board[1][1] == "A" && board[2][0] == "A") {
			return "A";
		}

		if (board[0][0] == "B" && board[1][1] == "B" && board[2][2] == "B") {
			return "B";
		}
		if (board[0][2] == "B" && board[1][1] == "B" && board[2][0] == "B") {
			return "B";
		}
		if (moves.length == 9) {
			return "Draw";
		}
		return "Pending";
	}
}