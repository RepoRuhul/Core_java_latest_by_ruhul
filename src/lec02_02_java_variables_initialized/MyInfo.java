package lec02_02_java_variables_initialized;

public class MyInfo {
	// variables initialized
	public String myName = "Tofael";
	public int myYearlySalary = 5672354;
	public char myGender = 'M';
	public float myHeight = 1.6537f;
	public boolean usCitizen = true;

	// Constructor declared
	public MyInfo() {
		System.out.println("--- :This is all about me: ---");
	}

	// method implemented
	public void myInfo() {
		System.out.println("My Name is: " + myName + ", My Yearly Salary: " + myYearlySalary + ", My Gender: "
				+ myGender + ", My height: " + myHeight + ", US citizen? : " + usCitizen);
	}

	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo(); // Constructor initialized here
		myInfo.myInfo(); // method initialized here

	}

}
