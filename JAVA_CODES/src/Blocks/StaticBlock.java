package Blocks;

public class StaticBlock {
	public static void main(String[] args) {

		int  EndNumber= 53;
		for( int i = 1; i<=EndNumber; i++)
		{
			if( i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	static {
		System.out.println(" This block is executed first by the compiler");
	}

}
