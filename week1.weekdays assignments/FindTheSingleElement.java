package week1.weekdays.assignments;

public class FindTheSingleElement {

	public static void main(String[] args) {
		int[] good = { 2, 2, 1 ,1,4};
		
		int leg1 = good.length;
		for (int i=0;i<leg1;i++) {
			int count = 0;
			for(int j=0;j<good.length;j++) {
				if(good[i]==good[j])
					count++;
			}
			if (count==1)
				System.out.println(good[i]);
			}
		}
		
		
	}
	

		