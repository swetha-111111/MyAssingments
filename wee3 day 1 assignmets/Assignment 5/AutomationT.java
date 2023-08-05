package week3.assignments;

public class AutomationT extends MultipleLangauge implements Language {


	@Override
	public void ruby() {
		
		System.out.println("Ruby is easy");
	}
	
	

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		
	}
	
public static void main(String[] args) {
		
	AutomationT	ll = new AutomationT();
	ll.python();
	ll.Java();
	ll.ruby();
	
}
}