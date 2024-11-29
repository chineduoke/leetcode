package leetcode.challenge3;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int missingNumber(int[] nums) {
		int m = nums.length; // the length of the array

		// initialize haShet to store input array ;
		Set<Integer> numbers = new HashSet<>();

		// Add all numbers from 0 to n to the set
		for (int i = 0; i <= m; i++) {
			numbers.add(i);
		}

		// Remove numbers present in the input array
		for (int num : nums) {
			numbers.remove(num);
		}

		// The remaining number in the set is the missing number
		return numbers.iterator().next();
	}
}
