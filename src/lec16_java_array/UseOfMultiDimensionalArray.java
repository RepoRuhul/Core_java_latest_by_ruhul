package lec16_java_array;

import java.util.Arrays;

public class UseOfMultiDimensionalArray {

	public static void main(String[] args) {
		String [] arr1 = new String [] {"One", "Two"};
		String [] arr2 = new String [] {"Four", "Five"};
		String [] arr3 = new String [] {"Six", "Seven"};
		String [] arr4 = new String [] {"One", "Six"};
		
		String [] [] multiDimensionalArray = new String [][] {arr1, arr2, arr3, arr4}; 
		// common name:  multi dimensional array [hard topic]
		// An array of array's, containing String objects 
		// Name:  double dimension array or two dimensional array or multi dimensional array -- important
		// Also interview Question
		// Line 13 is the take out from this page	
		
		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(multiDimensionalArray)); // providing Array ID, so not giving value

		// method is Not important, so no need to remember
		// Print the array using Arrays.deepToString() - "RECOMMENDED for multi-dimensional array"
		System.out.println(Arrays.deepToString(multiDimensionalArray));
		
		// int type
		int [] gradeOne = {5, 6, 5, 5};
		int [] gradeTwo = {7, 7, 8};
		
		int [][] allStudent = {gradeOne, gradeTwo};
		System.out.println(Arrays.deepToString(allStudent));
		
		
		
	}

}
