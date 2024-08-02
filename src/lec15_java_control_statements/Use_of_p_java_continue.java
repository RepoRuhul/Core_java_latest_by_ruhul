package lec15_java_control_statements;

// The class name is weird just to follow teaching order

public class Use_of_p_java_continue {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 6; i++) { 
			System.out.println(i);
		}
		// Regular outcome: 1, 2, 3, 4, 5, 6
				
		System.out.println("\n---------- for loop after continue 01  ----------\n");
		for (int j = 1; j <= 6; j++) { 
			if(j>3 && j%2==1) {
				continue; // if you use continue, this condition will only be skipped
				// continue used inside condition, it shows error if you use outside condition
				// continue; 
				// you cannot use 2 continue or 2 break inside one condition, see line 30, 32
			}
			System.out.println(j);
		}
		// Regular outcome: 1, 2, 3, 4, 5, 6
		// Outcome after  using continue: 1, 2, 4, 6
		
		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) {
			// Line 28, condition for the even numbers
			if (i % 2 == 0) { 
				continue; // continue will skip all the even number
			} else if (i==7) {
				continue; // we can use condition or break more than one time but inside the different condition body
				// see line 48
				// break or continue both can be used inside loop
			}
			
			
			System.out.println("The value is: " + i); 
		}	
		// Regular outcome with no use of continue: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// After use of continue: 1, 3, 5, 9

		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) { // Generally the outcome should be: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			if (i % 2 == 1) { // condition for the odd numbers and
				continue; // continue will skip all the odd number
			} else if (i==8) {
				break; // we can use break and continue in different condition body
			}
			System.out.println("The value is: " + i);
		}
		
		// Regular outcome with no use of continue: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// After use of continue: 2, 4, 6
		
		
		
		
		
		
		
		// not important
		// Exception in while and do while loop for using continue
		// if feel trouble, skip below
		
		System.out.println("\n---------- while loop after continue ----------\n");
		int j = 1;
		while (j <= 9) {
			if (j == 5) {
				j+=2; // important info:  this is an exception, because the outcome 5, doesn't go to print  and increment in next line, 
				// we use increment in line 64, so, the value of J become 7 from 5
				// important: if you comment out line 62: the code don't proceed further because the compiler don't know what is the value of J now
				continue;  
			}
			System.out.println("The value is: " + j); 
			j+=2; 
		}
		
		// Regular outcome with no use of continue: // 1, 3, 5, 7, 9
		// After use of continue: // 1, 3, 7, 9
		
		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);

		
		System.out.println("\n---------- do while loop after continue ----------\n");
		int l = 1;
		do {
			if (l == 5) {
				l=l+2; // this is an exception, because the outcome doesn't go to print  and increment in next line, we use increment here
				continue;
			}
			System.out.println("The value is: " + l);
			l = l + 2;
		} while (l <= 9);
						
		
		
		
		
		
		
	}

}
