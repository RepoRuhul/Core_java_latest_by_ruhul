package lec05_01_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature. static is a local member method of this class
// How you can resolve that issue?
// By making the variable static

public class Employee2 {
	public static String empName = "Mohammad Sharkar";
	public static int empId = 2188458;
	public static char gender = 'M';
	public static boolean fullTimeEmployee = false;

	// static is a local member method of this class
	public static void main(String[] args) {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + gender
				+ " and Full time Employee? Ans: " + fullTimeEmployee);

	}

}
