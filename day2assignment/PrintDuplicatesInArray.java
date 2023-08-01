package week1.day2assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] ball = { 2, 4, 6, 8, 10, 2, 6 };
		// get the length of the array
		int length1 = ball.length;
		// declare an int variable named count
		int count;
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i <= length1 - 1; i++) {
			// assign 0 to count
			count = 0;
			// iterate from i to the length of the array by adding 1 to it (inner loop
			// starts here)
			for (int j = i + 1; j < length1; j++) {
				// compare both the loop variables & check they're equal
				if (ball[i] == ball[j]) {
					// count++
					// print the matching value
					System.out.println("maching value " + ball[i]);

				}
			}

		}

	}

}
