package Constructors;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println(" Default constructor automaticallly invoked");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("Area of square : "+ (a*a));
	}
	ConstructorOverloading(int a, int b)
	{
		System.out.println("Area of rectangle: "+ (a*b));
	}
	public static void main(String[] args) { 
		new ConstructorOverloading();
		ConstructorOverloading square = new ConstructorOverloading(3);
		ConstructorOverloading rectangle = new ConstructorOverloading(3,6);
		
	}
	

}
