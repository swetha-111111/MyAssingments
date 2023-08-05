package week3.assignments;

public class Student extends Department{

	public void studentName() {
		System.out.println("The Student name is swetha");
	}
	
	public void studentDepart() {
		System.out.println("Masters-MBA");
	}
	
	public void studentID() {
		System.out.println("The Student ID is 1622000");
	}

	public static void main(String[] args) {
		Student ss = new Student();
		ss.collegeCode();
		ss.collegeName();
		ss.collegeRank();
		ss.deptName();
		ss.studentDepart();
		ss.studentID();
		ss.studentName();
		
	}

}
