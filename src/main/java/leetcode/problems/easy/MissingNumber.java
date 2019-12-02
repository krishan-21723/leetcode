package leetcode.problems.easy;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(missing1(arr));
		System.out.println(missing2(arr));
	}

	private static int missing1(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		;
		n++;
		return (n * (n + 1) / 2) - sum;
	}

	private static int missing2(int[] arr) {

		int xor_arr = 0;
		int xor_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			xor_arr = xor_arr ^ arr[i];
		}
		for (int i = 1; i <= arr.length + 1; i++) {
			xor_sum = xor_sum ^ i;
		}
		return xor_sum ^ xor_arr;
	}

}
