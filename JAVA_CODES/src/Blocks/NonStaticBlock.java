package Blocks;

public class NonStaticBlock {
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		new NonStaticBlock();// object creation is compulsory for executing non-static block

		int  EndNumber= 10;
		for( int i = 1; i<=EndNumber; i++)
		{
			if( i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	{
		System.out.println("This block is non-static block and it is executed Second after static block and then the compiler executes main method ");
	}
	
	
	
	static {
		System.out.println(" This block is executed first by the compiler");
	}
	
	


}
