package leetcode.challenge4;

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// create a placeholder Head ListNode to help create the new Linkedlist
		ListNode placeholderHead = new ListNode(2);
		// assign the placeholder head to the tail to keep track of the next node
		ListNode tail = placeholderHead;
		// initialise a carryOver integer that will help with calculation
		int carryOver = 0;

		// Loop through the l1 and l2 when the conditions are met
		while (l1 != null || l2 != null || carryOver != 0) {
			// extract the values from l1 and l2 or assign 0 if null
			int digit1 = (l1 != null) ? l1.val : 0;
			int digit2 = (l2 != null) ? l2.val : 0;

			// calculate the sum of the values and any carryover
			int sum = digit1 + digit2 + carryOver;
			// get the single value that will be added to the list
			int digit = sum % 10;
			// get any carryover values
			carryOver = sum / 10;

			// create a new ListNode and add its value
			ListNode newNode = new ListNode(digit);
			// Link the tail to the new node
			tail.next = newNode;
			tail = tail.next;

			// check if l1 and l2 are not null and get the next nodes
			l1 = (l1 != null) ? l1.next : null;
			l2 = (l2 != null) ? l2.next : null;
		}

		// get the Linkedlist result from next node of placeholderHead
		ListNode result = placeholderHead.next;
		return result;
	}

}

// ListNode class for creating linkedlists
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
