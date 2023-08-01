package week1.day2assignment;

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {
		int[] girl = { 10, 5, 15, 25, 33, 11 };
		int girl1 = girl.length;
		int[] boy = { 8, 4, 5, 22, 33, 13 };
		int boy1 = boy.length;

		for (int i = 0; i <= girl1 - 1; i++) {
			for (int j = 0; j <= boy1 - 1; j++) {
				if (girl[i] == boy[j]) {
					System.out.println("Common values in both " + girl[i]);
				}
			}
		}

	}
}
