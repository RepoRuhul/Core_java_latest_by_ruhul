package lec06_01_java_methods;

public class TestMethod {

	public static void main(String[] args) {
		A_VoidTypeMethod lvm = new A_VoidTypeMethod();
		lvm.addition();
		
		System.out.println("-----------------------------------------------------");
		B_ReturnTypeMethod lrm = new B_ReturnTypeMethod();
		lrm.addition();
		lrm.subtraction();
		lrm.myName();
		
		System.out.println("-----------------------------------------------------");
		C_MethodsCanBeCalledInsideAnotherMethod omc = new C_MethodsCanBeCalledInsideAnotherMethod();
		omc.subtraction();
		
		System.out.println("-----------------------------------------------------");
		D_MethodsCanBeCalledInsideConstructor mcc = new D_MethodsCanBeCalledInsideConstructor();
		
		System.out.println("-----------------------------------------------------");
		E_LearningStaticandFinalTypeMethod lsf = new E_LearningStaticandFinalTypeMethod();
		// lsf.addition(); // static methods are called by the class itself, no need of object to call a static method
		E_LearningStaticandFinalTypeMethod.addition();
		lsf.subtraction(); // final type method can't be changed	
		
		System.out.println("-----------------------------------------------------");
		F_LearningParameterizedMethod lpm = new F_LearningParameterizedMethod();
		lpm.addition(324, 120);
		lpm.addition(70, 60);
		
		System.out.println("-----------------------------------------------------");
		lpm.multiplication(3, 6);
		lpm.multiplication(6573, 350);
		
		System.out.println("-----------------------------------------------------");
		lpm.myName("Joe", "Biden");
		lpm.myName("Bill", "Clinton");
		lpm.myName("George", "Bush");
		
	}

}
