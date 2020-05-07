package leetcode.problems.easy;

class MergeSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[6];
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		nums1[3] = 0;
		nums1[4] = 0;
		nums1[5] = 0;
		int[] nums2 = new int[3];
		nums2[0] = 2;
		nums2[1] = 5;
		nums2[2] = 6;
		merge(nums1, 3, nums2, 3);
		for (int i = 0; i < 6; i++) {
			System.out.println(nums1[i]);
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
	}
}