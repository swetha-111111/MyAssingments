package week1.day;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nitialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		//Print first number
		//Iterate from 1 to the 11
		//Add first and second number assign to sum
		//Assign second number to the first number
		//Assign sum to the second number
		//Print sum
		
		int firstNo = 0 ;
		int secondNo = 1 ;
		int sum = 0;
		int i;
		
        
         for(i=0;i<11;i++) {
        	 
        	sum = (firstNo+secondNo);
        	//secondNo = firstNo ;
        	firstNo=secondNo;
        	secondNo=sum;
        	//sum = secondNo;
        	System.out.println(sum);
        	 
             
        	 
	}
         

}
}