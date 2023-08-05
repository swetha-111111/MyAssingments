package week3.assignments;

public class Students {

	public int getStudentInfo(int id) {

		System.out.println("value is" + id);
		return id;

	}

	public void getstudentinfo(int id, String name) {

		System.out.println(id + name);
	}

	public String getStudentInfo(String name) {

		System.out.println(name);
		return name;

	}

	public void getStudentInfo(String email, long phoneno) {

		System.out.println(email + phoneno);

	}

	public static void main(String[] args) {
		Students ff = new Students();
		ff.getStudentInfo(212344);
		ff.getStudentInfo("swetha");
		ff.getStudentInfo("swethamay@", 1235);
		ff.getstudentinfo(2223, "swetha.J");

	}
}
