package Conditional_Statements;

public class IfElseIf {
	public static void main(String[] args) {
		int a=89;
		int b  =98;
		int c =56;
		if (a>b && a>c )
		{
			System.out.println("a is greater");
			
		}
		else if( b>a && b> c )
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println(" c is greater");
		}
	}

}
