package lec13_01_java_conditional_statements;

public class Z01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'k';
		
		switch(size) {
		
		case 'S':
			System.out.println("Yes we have your small size shirt");
			break;
			
		case 'M':
			System.out.println("Yes we have your medium size shirt");
			break;
			
		case 'L':
			System.out.println("Yes we have your large size shirt");
			break;
			
		case 'X':
			System.out.println("Yes we have your extra large size shirt");
			break;
			
		default:
			System.out.println("Sorry! We don't have your shirt");
			break;
			
		}

	}

}
