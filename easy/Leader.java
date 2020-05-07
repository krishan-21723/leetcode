package leetcode.problems.easy;

public class Leader {

	public static void main(String[] args) {
		int[] arr = { 7, 6, 3, 4, 2, 3, 5 };
		leader(arr);
	}

	public static void leader(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}
