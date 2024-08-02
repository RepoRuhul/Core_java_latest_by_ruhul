package lec08_01_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------");
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.grandFatherInfo();
				
		System.out.println("\n----------------------------------------------------");
		Cousin cousin = new Cousin();
		cousin.cousinInfo();
		cousin.auntInfo();
		cousin.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------");
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		
		System.out.println("\n----------------------------------------------------");
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
	
		
		System.out.println("\n----------------------------------------------------");
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------");
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		// Niece extends Sister, Sister extends Father, Father extends GrandFather
		// Example of Multilevel Inheritance
		
		System.out.println("\n----------------------------------------------------");
		MySelf mySelf = new MySelf();
		mySelf.myInfo();
		mySelf.fatherInfo();
		mySelf.grandFatherInfo();
		
		// Aunt extends GrandFather, Father extends GrandFather, Uncle extends GrandFather
		// Example of Hierarchical Inheritance

	}

}
