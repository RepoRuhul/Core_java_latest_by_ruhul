package lec16_java_array;

import java.util.Arrays;

public class OtherMethodsFromArray {
	public static void main(String[] args) {
		int [] a = {5, 15, 50, 0, 0, 56};
		// Array is fixed size (Array is static)
		System.out.println("Before update, the value of a[0] is: " + a[0]);
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// New: How to update an existing Array?
		// Or: How to update an existing index of an Array?
		
		a[0] = 33;
		System.out.println("After update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// How many times we can update: As many time as we want
		a[0] = 75;
		System.out.println("After second update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// you can update any index
		a[0] = 25;
		a[1] = 39;
		a[4] = 76;
		// a[8] = 99; // no compilation error, run time error.
		// java.lang.ArrayIndexOutOfBoundsException
		System.out.println("After update, the value of a[0] is: " + a[0]); // final output:?
		System.out.println("After update, the value of a[0] is: " + a[1]); // final output:?
		System.out.println("After update, the value of a[0] is: " + a[4]); // final output:?
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		System.out.println("\n----- Increasing the length of an Array by Copying another array -----");
		// Array is fixed size (Array is static) -- talking about an array
		// how can we increase the length of an Array? [Important]:
		// Arrays.copyOf(original array, new length)
		// her, in line 47, Array name is b
		int [] b = Arrays.copyOf(a, 10);
		// declaring size of a new Array along with old Array Name [a] and new length 10

		// Is the length changed?
		// Is the length changed? line 40 is for line 52 comparison
		System.out.println("\nThe length of the new array is: " + b.length);
		System.out.println("To find the list of an Array: " + Arrays.toString(b));
		
		System.out.println("\n--------------------- Updating value of index of Array b -------------------------");
		b[2] = 27;

		b[5] = 99;
		b[6] = 60;
		b[7] = 65;
		b[8] = 68;

		System.out.println("Single index value for new Array: " + b[0]);// why output is: 25?
		System.out.println("Single index value for new Array: " + b[2]);// output: how it happen? 27 // because updated
		System.out.println("Single index value for new Array: " + b[5]);// output: 99
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ? 0
		System.out.println("To find the list of an Array after update of index value: " + Arrays.toString(b));
		
		System.out.println("\n------------------------------------------------------------------------");
		// increasing the size of Array can be done several times
		// Array name is c
		int[] c = Arrays.copyOf(b, 12); // Array vS Arrays, Arrays is a class is used to manipulate the Array
		System.out.println("The length of the new array is: " + c.length);
		System.out.println("Single index value for new Array: " + c[0]);// why output is: 25?
		System.out.println("Single index value for new Array: " + c[11]);// output: ? 0
		System.out.println("The list of the array's elements: " + Arrays.toString(c));
		
		// New --> if you need a selected part from the previous/existing Array [above one is more important]
		System.out.println("\n------------------------------------------------------------------------");
		int [] d = Arrays.copyOfRange(c, 2, 10);
		// if you need to decrease an Array or a specific size from the old Array
		// to copy the specific range of the old array
		// from which index to what index (range)// here 2 is starting index and 10 is
		// till that index, so last index is 8th as [end index-1] formula is used
		// Parameters:
		// 1) original: the array from which a range is to be copied
		// 2) from: the initial index of the range to be copied, inclusive
		// 3) to: the final index of the range to be copied, exclusive.(This index may
		// lie outside the array. 10-1)

		System.out.println("\nThe length of the array is: " + d.length);
		System.out.println("After update, The list of the array's [d] elements:" + Arrays.toString(d));
		
		System.out.println("\n------------------------------------------------------------------------");
		/*
		 * Arrays.equals(arr1, arr3);--->returns true if the two specified arrays of
		 * booleans are equal to one another. Two arrays are equal if they contain the
		 * same elements in the same order. Good to know: Two array references are
		 * considered equal if both are null.
		 */

		// How to compare two Array? here a and d.
		System.out.println("Is Array a and d is equal? Ans: " + Arrays.equals(a, d));
		
		// Another example which is String type
		String[] ax = new String []{"First", "Second", "Third", "Fourth", "Fifth"};
		System.out.println("The list of the array's [ax] elements: " + Arrays.toString(ax));
		// Literal representation of an String type Array, line 111 is the best  representation of an Array
		
		String[] ay = {"First", "Second", "Third", "Fourth", "Fifth"};
		System.out.println("The list of the array's [ay] elements: " + Arrays.toString(ay));
		
		// How to compare two Array? here a and c.
		System.out.println("Is Array ax and ay is equal? Ans: " + Arrays.equals(ax, ay));
		
		// for each loop is mostly used in industry, solely for Array? yes
		
		System.out.println("\n------------------------------------------------------------------------");
		// Not important
		Arrays.fill(a, 300); // --->to fill the all the value as same, so all value will be changed to 300 here
		System.out.println("After update, the value of Array is: " + Arrays.toString(a));


	}

}
