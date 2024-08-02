package lec07_01_java_type_casting;

public class UseOfWideningCasting {

	public static void main(String[] args) {
		int myBankBalance = 635376;
		System.out.println("My Bank Balance: " + myBankBalance);
		// How can you convert an int to a double type?
		// By Widening casting, you don't need to write the casting type in parentheses
		
		double myNewBankBalance = myBankBalance;
		System.out.println("My new Bank balance: " + myNewBankBalance);

	}

}
