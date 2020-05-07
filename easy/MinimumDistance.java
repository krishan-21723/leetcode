package leetcode.problems.easy;

public class MinimumDistance {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 4, 2, 3, 5 };
		int x = 6;
		int y = 5;
		System.out.println(min_dist(arr, x, y));
	}

	public static int min_dist(int[] arr, int x, int y) {
		int dist = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x || arr[i] == y) {
				if (dist >= 0) {
					break;
				}
				dist++;
			}
			if (dist >= 0) {
				dist++;
			}
		}
		return dist;
	}
}
