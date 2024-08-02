package lec13_02_string_manipulation;

public class DifferentMethodsOfString {

	public static void main(String[] args) {
		// If we write a String by creating an object, we have write like below	
		String a = new String("Good Morning");
		System.out.println(a);
				
		System.out.println("------------------------------------------------------------------------");
		// The below is how we represent String as variable
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		
		// The Java String class length() method finds the length of a string.(important)
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable [unchangeable] that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toLowerCase());
		
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(100): " + s.charAt(100));
		System.out.println("\nThe character at a specific position(111): " + s.charAt(111));
		// System.out.println("\nThe character at a specific position(111): " + s.charAt(112));
		// will show "StringIndexOutOfBoundsException"
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is in : " + s.indexOf("debitis maiores nemo")); 
		System.out.println("\nThe index of 'pariatur' word is in : " + s.indexOf("pariatur nulla?")); // Sentence doesn't work
	
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'l' is, at the position of: " + s.indexOf('l')); // case sensitive, 
		System.out.println("\nThe character 'r' is, at the position of: " + s.indexOf('r')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.


	
	}

}
