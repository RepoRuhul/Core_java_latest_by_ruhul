package lec09_01_java_oop_encapsulation;

public class TuteeTest {

	public static void main(String[] args) {
		Tutee tutee = new Tutee("Alexa", 26354, 'F', false, 3.357f);
		System.out.println("Student Name: " + tutee.getStName()  + "\nStudent Id: " + tutee.getStId() + "\nGender: "
				+ tutee.getStGender() + "\nFull Time student? : " + tutee.isFullTimeSt() + "\nGrade: " + tutee.getStGrade());

	}

}
