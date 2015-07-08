package ReverseLinkedList;

public class ReverseLinkedListSolution {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = head;
		ListNode temp = prev.next;
		while (temp != null) {
			ListNode next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
			;
		}
		head.next = null;
		return prev;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
