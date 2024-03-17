package CostrutorsCHAINING;

public class Sample {
	Sample()
	{
		System.out.println(" Hi this is default constructor");
	}
	Sample(int a)
	{
		this();
		System.out.println(" This is parameterized constructors");
	}
	Sample(int a, int b)
	{ 
		this(3);  // used to call constructors of the same class 
		System.out.println("Resut: "+ (a+b));
	}
	public static void main(String[] args) {
		Sample s =  new  Sample(5,6);
	}
	

}
