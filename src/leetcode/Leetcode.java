package leetcode;

import java.util.Arrays;

public class Leetcode {
	public static int missingNumber(int[] nums) {
		// sort nums array to be able to identify the first and last numbers
		Arrays.sort(nums);
		int n = nums.length;

		// Check if the first element is not equal to 0 and return 0
		if (nums[0] != 0)
			return 0;

		// Check if the last element is not equal to the length of the array and return
		// the array length
		if (nums[n - 1] != n)
			return n;

		// loop through elements between 0 and the last element and return the element
		// if not equal to index
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != i)
				return i;
		}

		return 1;
	}

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

	public int[] sortedSquares(int[] nums) {
		// Loop through the provided array
		for (int i = 0; i < nums.length; i++) {
			// assign the square of each value to the same position
			nums[i] = nums[i] * nums[i];
		}
		// sort the resulting array in increasing order
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 0, 1 };
		int n = missingNumber(nums);
		System.out.println(n);
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