package leetcode.problems.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairsRecursive(3));
		System.out.println(climbStairsDP(3));
	}

	public static int climbStairsRecursive(int n) {
		if (n == 1 || n == 0)
			return 1;
		return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
	}

	public static int climbStairsDP(int n) {
		int[] arr = new int[n + 1];
		arr[0] = arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}
}
