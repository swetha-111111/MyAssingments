package week1.weekdays.assignments;

public class HappyNumber {

	// Write an algorithm to determine if a number n is happy.

	// A happy number is a number defined by the following process:

	// Starting with any positive integer, replace the number by the sum of the
	// squares of its digits.
	// Repeat the process until the number equals 1 (where it will stay), or it
	// loops endlessly in a cycle which does not include 1.
	// Those numbers for which this process ends in 1 are happy.
	// Return true if n is a happy number, and false if not.

	// Example 1:

	// Input: n = 19
	// Output: true
	// Explanation:
	// 12 + 92 = 82
	// 82 + 22 = 68
	// 62 + 82 = 100
	// 12 + 02 + 02 = 1
	// Example 2:

	// Input: n = 2
	// Output: false
	public static int isHappyNumber(int number) {
		int sum = 0;

		int remainder = 0;

		while (number > 0) {
			remainder = number % 10;

			sum = sum + (remainder * remainder);
			number = number / 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int happy = number;
		
		while (happy !=1 && happy !=4) {
			happy = isHappyNumber(happy);
		}

		if (happy == 1) {
			System.out.println(number +  " True the number is happy");
		}
		else
		{
			System.out.println(number +  " False the number is not happy");
		}

}
}
