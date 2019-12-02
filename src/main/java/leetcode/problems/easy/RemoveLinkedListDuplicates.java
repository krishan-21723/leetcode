package leetcode.problems.easy;

class RemoveLinkedListDuplicates {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		ListNode l3 = new ListNode(2);
		l2.next = l3;
		ListNode l4 = new ListNode(3);
		l3.next = l4;
		ListNode head = deleteDuplicates(l1);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

//	  Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode ptr = head;
		while (ptr != null && ptr.next != null) {
			if (ptr.val == ptr.next.val) {
				ptr.next = ptr.next.next;
			} else {
				ptr = ptr.next;
			}
		}
		return head;
	}
}