package Methods;

public class NoReturnButWithArg {
	public void display(int a, int b)
	{
		System.out.println("Sum : "+ (a+b));
	}
	public static void main(String[] args) {
		NoReturnButWithArg obj = new NoReturnButWithArg();
		obj.display(23,7);
	}
}
