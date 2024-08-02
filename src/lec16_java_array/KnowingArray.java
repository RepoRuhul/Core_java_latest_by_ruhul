package lec16_java_array;

import java.util.Arrays;

// What is an Array?
// An array is a collection of items of same data type stored at contiguous memory locations. 

public class KnowingArray {

	public static void main(String[] args) {
		// Generally every value is assigned to a variable name, but in Array, a set of value present under one name
		String val1 = "Joe Biden";
		String val2 = "Donald Trump";
		String val3 = "Barac Obama";
		String val4 = "Bush Jr";
		String val5 = "Bill Clinton";
		System.out.println(val1);
		System.out.println("--------------------- Regular way above ---------------------");
		
		// Array
		// same data type or a cluster of data present
		// How to write an Array? You must know
		// first data type, then [], it is called container, the president (OBJECT) is the name of Array, 
		// [5] represent total 5 data is present
		// Array is static [fixed number of data], [interview question]
		String [] president = new String [5];
		
		president [0] = "Joe Biden";
		president [1] = "Donald Trump";
		president [2] = "Barak Obama";
		
		president [4] = "Bill Clinton";
		
		System.out.println(president.length);
		System.out.println(president[0]);
		System.out.println(president[3]);
		// System.out.println(president[5]);  //  java.lang.ArrayIndexOutOfBoundsException
		
		// or we can write this way, called "literal representation" of an Array
		System.out.println("\n------------------------------------------------------------------------");
		String [] presidents =  new String [] {"Joe Biden", "Donald Trump", "Barak Obama", "", "Bill Clinton"};
		
		System.out.println(presidents.length);
		System.out.println(presidents[1]);
		System.out.println(presidents[4]);
		
		// important interview question: length () vs length
		// or how can you get the size of a String and an Array?
		// length preserve the size of an array, length is not a method or field or variable,
		// rather length is a parameter/properties
		// length() is a method of String to know the size of a String
		
		//or	without  new String [] 
		// This is mostly used, 99%
		// here allPresident is called 'Array Name' or 'Array Object'
		System.out.println("\n------------------------------------------------------------------------");
		String [] allPresident =  {"Joe Biden", "Donald Trump", "Barak Obama", "", "Bill Clinton"};
		System.out.println(allPresident[2]);
		System.out.println(allPresident.length);
				
		System.out.println("\n------------------------------------------------------------------------");
		
		// How to print an Array?
		// What will happen if you directly print by Array name or array object? Ans: you will get the "Array ID"
		System.out.println(allPresident);
		// next line, important interview question: How can you print all the data's from an Array
		// Array vs Arrays, Arrays is a class which is used to manipulate the Array
		// solution below
		// very very important -->  toString(object) method
		// no need to memorize
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		System.out.println(Arrays.toString(allPresident));
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(sex[3]);
		System.out.println(sex.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// int type
		int [] age = {23, 54, 12, 66, 88, 23, 80, 43};
		System.out.println(age.length);
		System.out.println(age[3]);
		System.out.println(age[0]);
		// System.out.println(age[8]);
		// System.out.println(age[-1]);
		// interview question: What is the exception you got if Array is out of range?
		// Ans: ArrayIndexOutOfBoundsException
		
		// int [] a = {5, 15, 50, 0, 56};
		// a.length value is 5;
		// a[0]=5, a[1]=15, a[2]=50, a[3]=0, a[4]=56
		// a[4] = 56
		// a[5-1] = 56, this line is for explanation of next line
		// a[a.length - 1] = 56 = last index formula, you must understand and memorize
			
		// For example
		// a.length = 100;
		// a[99] = a[100-1] = a[a.length-1]
		// This is a formula: last index is a[a.length-1]
		// This is a formula: second last index is a[a.length-2], interview question: How can we get the second last index from an Array?
		// This is a formula: third last index is a[a.length-3] and so on .........
		
		// important interview question: How to find (what is the formula) the value for the second last index from an Array?
		System.out.println("\nPrinting the last number of the Array: " + age[age.length - 2]); 
		
		System.out.println("\n------------------------------------------------------------------------");
		// boolean type
		boolean [] fullTimeStudent = {true, true, false, true, false};
		System.out.println(fullTimeStudent[3]);
		
		System.out.println("\n------------------------------------------------------------------------");
		// Just FYI, brain storming
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		// System.out.println(b[0]); // newly added
		// System.out.println(b); // show Array Index
		System.out.println("To find an Array when size is Null: " + Arrays.toString(b)); // You will find Empty Array
		System.out.println(b.length);
		
		// You can skip below
		System.out.println("\n------------------------------------------------------------------------");
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + age); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(age));
		// hashCode of the Array used for representation of array by data	
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 66)); // which index is 66?
		// here a is the name of the array, 66 is the value checking the index number
		// binary search to get the index position of the value from the ref
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(age, 3)); //TODO WHY -1?
		
	}

}
