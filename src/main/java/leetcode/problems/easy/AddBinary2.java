package leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class AddBinary2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		List<Long> dfs = new ArrayList<Long>();
		Set<Long> set = new TreeSet<Long>(dfs);

		TreeNode n1 = new TreeNode(0);
		TreeNode n2 = new TreeNode(8);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(2);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(5);
		TreeNode n8 = new TreeNode(7);
		TreeNode n9 = new TreeNode(6);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n4.right = n6;
		n5.left = n7;
		n6.right = n8;
		n7.left = n9;
		System.out.println(verticalTraversal(n1));
	}

	public static List<List<Integer>> verticalTraversal(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		List<List<Integer>> listlist = new ArrayList<List<Integer>>();
		populateDistnce(root, map, 0);
		for (Integer key : map.keySet()) {
			List<Integer> list = map.get(key);
			Collections.sort(list);
			listlist.add(list);
		}
		return listlist;
	}

	static void populateDistnce(TreeNode root, Map<Integer, List<Integer>> map, int distance) {
		if (root == null) {
			return;
		}
		if (map.containsKey(distance)) {
			List<Integer> list = map.get(distance);
			list.add(root.val);
			map.put(distance, list);
		} else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(root.val);
			map.put(distance, list);
		}
		int left_dist = distance - 1;
		int right_dist = distance + 1;
		populateDistnce(root.left, map, left_dist);
		populateDistnce(root.right, map, right_dist);
	}
}