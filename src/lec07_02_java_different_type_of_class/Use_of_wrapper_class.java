package lec07_02_java_different_type_of_class;

public class Use_of_wrapper_class {

	public static void main(String[] args) {
		System.out.println("\n................. Conversion of a String to int type.....................\n");
		String name1 = "241";
		System.out.println(name1);
		System.out.println(name1+100); // name1 is String type and 100 is int type, can't do addition
		// The below one is the formula to convert from String to int: Integer.parseInt(String Type name)
		// 100% interview question
		int newName1 = Integer.parseInt(name1);
		System.out.println(newName1+100); // now both are int type
		
		System.out.println("\n................. Conversion of a String to int type (when String is not a pure number, like 241Tofael) .....................\n");
		String name2 = "241Tofael";
		System.out.println(name2);
		// run time error vs compilation error
		// compilation error can be seen before run the code during compilation
		// run time error can be seen after run the code, see line 20
		// System.out.println(Integer.parseInt(name2));
		
		System.out.println("\n................. Conversion of a String to double type .....................\n");
		String name3 = "3.15";
		System.out.println(name3);
		// how can you convert a String to double? Ans:  Double.parseDouble(name3)
		System.out.println(Double.parseDouble(name3)); 
		
		System.out.println("\n................. conversion of a String to float type .....................\n");
		String name4 = "3.15f";
		System.out.println(name4); // 3.15f
		// how can you convert a String to float? Ans:  Float.parseFloat(name4)
		System.out.println(Float.parseFloat(name4));
		
		System.out.println("\n................. conversion of a String to boolean .....................\n");
		String employee1 = "true";
		System.out.println(employee1); // "true" outcome as a String outcome
		System.out.println(Boolean.parseBoolean(employee1)); // but here is boolean type
		// imp interview question: by default boolean is false
		
		
		System.out.println("\n................. conversion of a String to character .....................\n");
		// conversion from String to char (We will study it when we start String Manipulation)
		// String is a collection of Character, no specific formula for now
		
		
		System.out.println("\n................. conversion from int to String .....................\n");
		int empId = 220;
		System.out.println(empId); 
		System.out.println(empId+10); 
		// how to convert from int to String? Ans:  String.valueOf(int empId)
		System.out.println(String.valueOf(empId)+10);
		
		
		
		System.out.println("Summary of this Page");
		/*
		 most common and important interview question
		 how to convert from String to int? Ans:  Integer.parseInt(String name1)
		 how to convert from int to String? Ans:  String.valueOf(int empId)
		 
		 Summary from top:
		 how to convert from String to double? Ans: Double.parseDouble(name1)
		 how to convert from String to float? Ans: Float.parseFloat(name1)
		 how to convert from String to boolean? Ans: Boolean.parseBoolean(name1)
		 
		 Didn't show:
		 how to convert from String to byte? Ans: Byte.parseByte(name1)
		 how to convert from String to short? Ans: Short.parseShort(name1)
		 how to convert from String to long? Ans: Long.parseLong(name1)
		 */
		
	}

}
