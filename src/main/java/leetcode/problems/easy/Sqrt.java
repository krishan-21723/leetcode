package leetcode.problems.easy;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(9));
	}

	public static int mySqrt(int x) {
		long res = 1;
		long i = 1;
		while (res <= x) {
			i++;
			res = i * i;
		}
		return (int) (i - 1);
	}

	public static int mySqrt_binary(int x) {
		int start = 1, end = x, ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid * mid == x) {
				return mid;
			}
			if (mid * mid < x) {
				start = mid + 1;
				ans = mid;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}
}
