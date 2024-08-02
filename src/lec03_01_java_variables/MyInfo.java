package lec03_01_java_variables;

public class MyInfo {
	// Not a pure primitive data type
	public String myName = "Tofael";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	public byte myAge = 127; // -128 to 127
	public short myApartmentRent = -32768; // –32,768 to 32,767	
	public int myYearlySalary = 5672354; // –2,147,483,648 to 2,147,483, 647 
	public long myBankBalance = -2147483648l; // –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, but when you cross the range of int, you must have to use l, example: 2147483648
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.6537f;
	// we must have to use lower case f, at the end of float value
	public double myGrade = 3.46936569855;
	// Above 6 types are used for number, values are represented with no quotation
	// Important: Mostly int is used for complete number and float for decimal number
	
	// char type variable value have single character, inside single the quotation, and in upper case	
	public char myGender = 'M';
	
	// boolean type variable values are with no quotation. Represented by 'true' or 'false' in lower case only	
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
