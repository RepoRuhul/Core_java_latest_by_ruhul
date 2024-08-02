package lec15_java_control_statements;

// The class name is weird just to follow teaching order

public class use_of_q_java_break_inside_nested_loop {

	// not important
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // 1, 2, 3
			for (int j = 1; j <= 3; j++) { // 1, 2, 3
				// if no break present in line 13 outcome will be 10-12 line
				// 1 1, 1 2, 1 3
				// 2 1, 2 2, 2 3
				// 3 1, 3 2, 3 3
				if (i == 2 && j == 2) {
					break;
				}
				// if break present, this break will implement only inside inner loop, not in the outer loop
				// 1 1, 1 2, 1 3
				// 2 1
				// 3 1, 3 2, 3 3
				System.out.println(i + " " + j);
			}

		}

	}

}
