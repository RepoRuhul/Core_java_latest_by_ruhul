package lec15_java_control_statements;

/*
This is a very important topic used almost everywhere, like variables and methods

for loop: most commonly used (No 1) loop
for loop, while loop, do while loop contain 3 part -->
initialization block -----> int i=0;   ----> From where it will start
conditional block -----> i<=5; 
and incremental (i++) or decremental block (i--) ---> increment or decrement by 1

What are the common mistakes: forgot type of variable (like: int), semicolon (;) -- we put coma instead
Most important info: after condition check, loop body [means print], then increment or decrement

i++ means increment by 1 (most common style for increment by 1)
i=i+1 means increment by 1
i +=1 means increment by 1

i = i+2 means increment by 2
i += 2 means increment by 2

i = i+3 means increment by 3
i +=3 means increment by 3


i++ or i=i+1 or i+=1
i=i+2 or i+=2
i=i+3 or i+=3

i-- means decrement by 1
i = i-1 means decrement by 1
i -= 1 means decrement by 1

i = i-2 means decrement by 2
i -= 2 means decrement by 2
i = i-3 means decrement by 3
i -= 3 means decrement by 3

The name for-loop comes from the word "for". For is used as the keyword in many 
programming languages to introduce a for-loop.

*/

/*	

     for(initialization block with data type; conditional block; incremental or decremental block) {
			System.out.println()
			or we can use condition
     }
*/

public class Use_of_java_for_loop {

	public static void main(String[] args) {
		// incremental block is used here
		System.out.println("\n-------------- for loop 01 --------------\n");		
		
		for(int i=0; i<5; i++) {		
			System.out.println(i);		
		}
		// 0, 1, 2, 3, 4
		
		System.out.println("\n-------------- for loop (incremented by 2) --------------\n");
		for(int i = 1; i<=10; i=i+2) {
			System.out.println(i);
		}
		// 1, 3, 5, 7, 9
		
		System.out.println("\n-------------- for loop (incremented by 3) --------------\n");
		for (int i = -5; i <=10; i += 3) {
			System.out.println(i);
		}
		// -5, -2, 1, 4, 7, 10
		
		System.out.println("\n---------- for loop 04  ----------\n");
		for(double i = 5.5; i <11; i = i+2.5) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 05  ----------\n");
		int j = 2;
		for (int i = 1; i < 10; i = i + 3) { 
			System.out.println("The values are: " + i * j);
		}
		// Outcome of i = 1, 4, 7
		// 2, 8, 14
		
		System.out.println("\n---------- for loop 06, condition false  ----------\n");
		for(int i=0; i>10; i++) {
			System.out.println(i);
		}
		// if the condition is false, loop terminated, value of i will not move to the for loop body
		
		
		// decremental block is used here
		System.out.println("\n---------- for loop 07, decremental  ----------\n");
		for(int i=10; i>5; i--) {
			System.out.println(i);
		}
		// 10, 9, 8, 7, 6, 
		
		System.out.println("\n---------- for loop 08, condition is false  ----------\n");
		// as condition is false, nothing will execute/print
		for (int i = 5; i < 0; i--) {
			System.out.println(i);
		}
		
		// very common mistake by new comer
		// this is infinite loop, so comment out not to run, common mistake when you select conditional block
		System.out.println("\n---------- for loop 09, inifinite loop  ----------\n");
//		for (int i = 10; i >0; i++) {
//			System.out.println(i);
//		}
		
		
		System.out.println("\n---------- for loop 10  ----------\n");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- for loop 11  ----------\n");
		int l = 2;
		for (int i = 18; i > 10; i = i - 3) {
			System.out.println(i + l);
		}
		// Outcome of i:  18, 15, 12
		// 20, 17, 14
		
		System.out.println("\n---------- for loop 12  ----------\n");
		int m = 2;
		for (int i = 25; i > 10; i -= 3) { 
			System.out.println(i/m);
		}
		// outcome of i: 25, 22, 19, 16, 13
		// 12, 11, 9, 8, 6
		// why not 12.5? because int type is complete number, no decimal
		
		
		System.out.println("\n---------- for loop 13, condition is false  ----------\n");
		// as condition is false, nothing will execute/print
		int n = 2;
		for (int i = 25; i < 10; i -= 3) {
			System.out.println(i + n);
		}
		
		System.out.println("-----------------------------------------");
		// how can you got even number from 0 to 10?
		for(int i = 0; i<=10; i+=1) {
			if(i%2==0) {
				System.out.println("Even number: " + i);
			} else if (i%2==1) {
				System.out.println("Odd number: " + i);
			} else {
				System.out.println("The system failed to execute this number");
			}
			
		}
		
		// Regular outcome:  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		// after using if block: 
		
		
		
	
	}

}
