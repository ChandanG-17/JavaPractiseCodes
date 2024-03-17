package Polymorphism;
// This is the example of Compile Time PolyMorphism/ Method Overloading/ Early Binding/ Static  Method Dispatch
public class MethodOverloading {
	public int area(int a)
	{
		System.out.println("area of square :");
		return a*a; 
	}
	public float area(float a, float b)
	{
		System.out.println("area of rectangle :");
		return a*b;
		
	}
	public float area( double a, double b)
	{    System.out.println("area of double rectangle:");
		return (float)(a*b);
	}
     public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.area(5));  // method overloading
		System.out.println(obj.area(34.2f, 87.5f)); // method overloading
		System.out.println(obj.area(34.66,654.67)); // method overloading
		
	}
}
