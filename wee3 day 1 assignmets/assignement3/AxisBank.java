package week3.assignments;

public class AxisBank extends BankInfo{

	@Override
	public void deposit() {
		
		super.deposit();
		System.out.println("axis bank deposit");
	}

	public static void main(String[] args) {
		AxisBank kk = new AxisBank();
		kk.deposit();
		
	}

	}


