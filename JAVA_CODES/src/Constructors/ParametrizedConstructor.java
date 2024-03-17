package Constructors;

public class ParametrizedConstructor {
	
	ParametrizedConstructor(int a, int b)
	{
		System.out.println("Parameterized constructors invoked");
		System.out.println("Sum : "+ (a+b));
	}
	public static void main(String[] args) {
		new ParametrizedConstructor(23,9);
	}
}
