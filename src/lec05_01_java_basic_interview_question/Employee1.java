package lec05_01_java_basic_interview_question;

// Can you call a non-static variable or method inside the main method?
// Ans: By creating an object [line 11, 12]
// But the interviewer will ask you, without creating object, see next class

public class Employee1 {
	public String empName = "Mohammad Sharkar";

	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		System.out.println(employee1.empName);

	}

}
