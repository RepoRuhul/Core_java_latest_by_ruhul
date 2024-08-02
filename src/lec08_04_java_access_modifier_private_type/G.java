package lec08_04_java_access_modifier_private_type;

public class G extends I{

	// variable declared
	private String info3;

	// constructor declared
	private G() {
		System.out.println("This Constructor is coming from class G, This Constructor is private type");
	}

	// method implemented
	private void g() {
		System.out.println("This method is coming from class G which is private type");
	}

	public static void main(String[] args) {
		G g = new G();
		// Constructor will be initialized here
		g.info3 = "This variable is coming from class G which is private type"; // variable initialized here
		System.out.println(g.info3);
		g.g();
		// g.iMethod();
		// private method from other class can't be called
		// even though a child class inherit a parent class, but child class can't inherit private properties

	}

}
