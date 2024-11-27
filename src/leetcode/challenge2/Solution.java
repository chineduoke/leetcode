package leetcode.challenge2;

import java.util.Arrays;

public class Solution {
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
}
