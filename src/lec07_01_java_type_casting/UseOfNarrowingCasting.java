package lec07_01_java_type_casting;

public class UseOfNarrowingCasting {
	// mostly used for converting float/double to byte/short/int/long type
	public static void main(String[] args) {		
		double myGrade = 3.54765836;
		System.out.println("My grade in double: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		
		int myNewGradeInInt = (int)myGrade; // Here is the casting
		System.out.println("My new Grade in int: " + myNewGradeInInt);
		
		// How can you convert a double to a byte type?
		byte myNewGradeInByte = (byte)myGrade;
		System.out.println("My new Grade in byte: " + myNewGradeInByte);
	}

}
