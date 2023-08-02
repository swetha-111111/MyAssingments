package week1.weekdays.assignments;

public class MajorityElement {

	public static void main(String[] args) {
		      // TODO Auto-generated method stubGiven an array nums of size n, return the majority element.
              //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
              //Example 1:
              //Input: nums = [3,2,3]
              //Output: 3
              //Example 2:
              //Input: nums = [2,2,1,1,1,2,2]
              //Output: 2
		int[] number = { 2,2,3,4,2};
		int length = number.length;
		
		int maxvalue=0;
		
		for (int i=0;i<length;i++) {
			int count=0;
			for(int k=0;k<length;k++) {
				if(number[i]==number[k])
					count++;
					
			}
			if(count>length/2)
				maxvalue=number[i];
			//break;

		}
		System.err.println("majority number " +maxvalue);
		
	}
}