package leetcode.problems.easy;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 7, 7, 7, 7, 2, 3, 5 };
		majority(arr);
	}

	public static void majority(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int freq = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq++;
				}
			}
			if (freq > ((arr.length) / 2)) {
				System.out.println(arr[i]);
				break;
			}
		}

	}
}
