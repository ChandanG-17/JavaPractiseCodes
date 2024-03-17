package Interface;

//Solution for multiple inheritance 
//-----------------------------------
// Interface for the first parent
interface Parent1 {
	void method1();
}

// Interface for the second parent
interface Parent2 {
	void method2();
}

// Class implementing both interfaces
class Child implements Parent1, Parent2 {
	@Override
	public void method1() {
		System.out.println("Method 1 from Parent1");
	}

	@Override
	public void method2() {
		System.out.println("Method 2 from Parent2");
	}

	// Additional methods in the child class
	public void childMethod() {
		System.out.println("Additional method in Child");
	}
}

public class Main {
	public static void main(String[] args) {
		// Create an instance of the child class
		Child child = new Child();

		// Call methods from both parents
		child.method1();
		child.method2();

		// Call additional method in the child class
		child.childMethod();
	}

}
