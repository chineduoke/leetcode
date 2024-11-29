package leetcode.challenge1;

class Solution {
	public double average(int[] salary) {

		int maxSalary = salary[0]; // initializing the maxSalary to first salary
		int minSalary = salary[0]; // initializing the minSalary to first salary
		int totalSalary = 0; // Initialize total salary as 0

		int m = salary.length; // length of salary
		for (int n : salary) {

			minSalary = Math.min(minSalary, n); // update minSalary to smallest value encountered
			maxSalary = Math.max(maxSalary, n); // update maxSalary to largest value encountered
			totalSalary += n; // add current salary totalSalary

		}
		// Calculate the average excluding the minimum and maximum salaries
		// Subtract minSalary and maxSalary from totalSalary and divide by (m - 2)
		// m = salary.length;
		// -2 is minum and maximu salary excluded
		return (totalSalary - minSalary - maxSalary) / (m - 2);
	}
}
