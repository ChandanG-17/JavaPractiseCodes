package Methods;

public class NoReturnNoArg {
	public void display()
	{
		int i=0;
		int n=10;
		for(i=0;i<n;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		NoReturnNoArg obj = new NoReturnNoArg();
		obj.display();
	}

}
