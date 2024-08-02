package lec03_03_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor Initialized
		tofael.myName = "Mohammad Sharkar"; // object can initialized variables
		tofael.myAge = 80;
		tofael.myApartmentRent = 31000;
		tofael.myYearlySalary = 2546523;
		tofael.myBankBalance = 583765863485l;
		tofael.myHeight = 1.643957f;
		tofael.myGrade = 3.56847365;
		tofael.myGender = 'M';
		tofael.usCitizen = true;
		tofael.myInfo(); // method initialized
		
		System.out.println("---------------------------------\n");
		MyInfo amber = new MyInfo();
		amber.myName = "Amber Douglas";
		amber.myAge = 34;
		amber.myApartmentRent = 26000;
		amber.myYearlySalary = 453624361;
		amber.myBankBalance = 65842847263486l; 
		amber.myHeight = 1.87653f;
		amber.myGrade = 3.1221223;
		amber.myGender = 'F';
		amber.usCitizen = false;
		amber.myInfo(); 
		
		System.out.println("---------------------------------\n");
		MyInfo aroah = new MyInfo();
		aroah.myName = "Aroah";
		aroah.myAge = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.myGender = 'F';
		aroah.usCitizen = false;		
		aroah.myInfo();
		
		
		
	}

}
