package CostrutorsCHAINING;

class Parent {
	Parent() {
		System.out.println("This is super class constructor");
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("This is child class constructor");
	}

}

public class Demo extends Child {
	Demo() {
		super();
		System.out.println("This is main class constructor");
	}

	public static void main(String[] args) {
		new Demo();
	}

}
