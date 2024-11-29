package leetcode.challenge5;

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
// Creating a dummy node to start the merged list        
		ListNode previous = new ListNode(-1);
		ListNode current = previous;
// Iterating through the lists using a while loop provided the lists are not null
		while (list1 != null && list2 != null) {
// If list1 node value is smaller or equal to list2 node value, add it to the merged list
			if (list1.val <= list2.val) {
				current.next = list1;
// Move the pointer in list1 to the next node
				list1 = list1.next;
			} else {
// If it is the case that list2 node value is smaller, add it to the merged list
				current.next = list2;
// Move the pointer in list2 to the next node
				list2 = list2.next;
			}
// Move the current pointer to the next node of the merged list
			current = current.next;
		}
// If list2 is null and there are any remaining nodes in list1, add them to the merged list
		if (list1 != null) {
			current.next = list1;
// If list1 is null and there are any remaining nodes in list2, add them to the merged list

		} else if (list2 != null) {
			current.next = list2;
		}
// Return the merged list starting from the first node excluding the dummy node-previous
		return previous.next;
	}
}

//ListNode class for creating linkedlists
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
