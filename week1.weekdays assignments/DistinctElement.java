package week1.weekdays.assignments;

public class DistinctElement {

	private static final String Break = null;

	public static void main(String[] args) {
		 int[] unique = {1,2,3,4,6,5};
		 int count=0;
		 int length = unique.length;
		 for(int i=0;i<length;i++) {
			 for(int j=0;j<length;j++) {
				 if(unique[i]==unique[j])
					 count++;
			}
			 if(count!=1) {
				 System.out.println("true");
				 
			 }
			 else
			 {
				 System.out.println("false");

			 }
		 }
	}

}
