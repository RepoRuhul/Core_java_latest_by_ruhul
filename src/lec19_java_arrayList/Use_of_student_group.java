package lec19_java_arrayList;

import java.util.ArrayList;

public class Use_of_student_group {

	public static void main(String[] args) {
		Student s1 = new Student("Ahmed", 100, "Dewan");
		Student s2 = new Student("Narima", 200, "M");
		Student s3 = new Student("Shahnaz", 300, "A");
		Student s4 = new Student("Fatema", 50, "Z");
		Student s5 = new Student("Shampa", 150, "A");
		
		ArrayList<Student> ar = new ArrayList<>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		ar.add(s5);
		
		// print by using for each loop/enhanced for loop/advanced for loop
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(Student st: ar) { //st is a container, where to put the value from the below loop
			System.out.println(st.fName + ", " + st.age + ", " + st.lName);
		}

	}

}
