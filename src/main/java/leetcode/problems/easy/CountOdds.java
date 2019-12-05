package leetcode.problems.easy;

class CountOdds {

	public static void main(String[] args) {
		int[][] moves = new int[][] { new int[] { 0, 1 }, new int[] { 1, 1 } };
		System.out.println(oddCells(2,3,moves));
	}

	public static int oddCells(int n, int m, int[][] indices) {
		int[][] arr = new int[n][m];
		for (int i = 0; i < indices.length; i++) {
			int[] p = indices[i];
			int row = p[0];
			int col = p[1];
			for (int j = 0; j < m; j++) {
				arr[row][j] = arr[row][j] + 1;
			}
			for (int j = 0; j < n; j++) {
				arr[j][col] = arr[j][col] + 1;
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 2 == 1) {
					count++;
				}
			}
		}
		return count;
	}
}