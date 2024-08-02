package lec09_01_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Mohammad Sharkar");
		student.setStId(2188458);
		student.setStGender('M');
		student.setFullTimeSt(true);
		student.setStGrade(3.36574f);
		
		System.out.println("Student Name: " + student.getStName() + "\nStudent Id: " + student.getStId() + "\nGender: "
				+ student.getStGender() + "\nFull Time student? : " + student.isFullTimeSt() + "\nGrade: " + student.getStGrade());

		// If we create more object, then we can set new data and also can get the new outcome
		
		
	}

}
