package leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

class UniqueCharSubString {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int max_len = 0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> set = new HashSet<Character>();
			int j = i;
			while (j < s.length()) {
				char c = s.charAt(j);
				if (set.contains(c)) {
					break;
				} else {
					set.add(c);
				}
				j++;
			}
			int len = j - i;
			if (len > max_len) {
				max_len = len;
			}
		}
		return max_len;
	}
}