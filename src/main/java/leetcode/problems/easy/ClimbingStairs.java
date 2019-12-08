package leetcode.problems.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		System.out.println(minimumCost(arr, arr.length));
	}

	static int minimumCost(int cost[], int n) {
		int res[] = new int[n];
		if (n == 1)
			return cost[0];
		res[0] = cost[0];
		res[1] = cost[1];
		for (int i = 2; i < n; i++) {
			res[i] = Math.min(res[i - 1], res[i - 2]) + cost[i];
		}
		return Math.min(res[n - 2], res[n - 1]);
	}

}
