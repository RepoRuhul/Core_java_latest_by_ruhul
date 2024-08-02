package lec20_01_java_linkedList;

public class Student {
	// declaring some variables
	public String fName;
	public int age;
	public String lName;
	
	// default Constructor
	public Student() {
		System.out.println("Default Constructor");
	}

	// parameterized Constructor
	public Student(String fName, int age, String lName) {
		this.fName = fName;
		this.age = age;
		this.lName = lName;
	}

}
