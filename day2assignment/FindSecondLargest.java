package week1.day2assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int length1 = data.length;
		
		Arrays.sort(data);
		
		//for(int i=0;i<=length1-1;i++) {
		//System.out.println(data[i]);
		System.out.println(data[length1-2]);
	}

}

