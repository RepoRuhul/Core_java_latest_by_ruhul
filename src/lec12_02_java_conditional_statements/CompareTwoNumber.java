package lec12_02_java_conditional_statements;


/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Below keywords are used
Example: if, else, else if, switch. 
Regarding condition: In First condition, we have to always use 'if' keyword.
now, if the condition is true, the condition body (inside the curly braces) will be executed and the rest will be skipped 
if the condition is false, the body will be skipped
Generally we don't use --> 2 "if" condition (code wise OK), 
Generally the true statement is written at the end.
rather we use 'if' as first condition and 'else' or 'else if' as second condition or last condition. 
When we write 'else' keyword, no condition is necessary to write inside parentheses,
Whatever you want to print, it will be printed in else block. 
either it is true or false, correct or incorrect, logical or not logical, it doesn't matter
But if we wish to write a second condition , we have to use 'else if' with condition, not 'else' 
The last condition is generally "else", but not always
'If' condition and 'else' condition is used one time in the execution
first condition 'if', last condition generally 'else', but not always, 
'else if' can also be is used with condition at the end.
if there are more condition, you can use more than one 'else if' condition
 */

public class CompareTwoNumber {

	public static void main(String[] args) {
		int val1 = 66;
		int val2 = 16;
		
		if (val1>val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1<val2) {
			System.out.println(val1 + " is smaller than " + val2);
		} else if (val1==val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("Please provide a correct number");
		}
		
	}

}
