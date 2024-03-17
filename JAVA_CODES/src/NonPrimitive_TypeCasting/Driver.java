package NonPrimitive_TypeCasting;


 class Base {
	int pmark=100;
	
	public void Parent() {
		System.out.println("Parent");
	}

}
class Child extends Base{
	int cmark=99;
	
		public void Sub() {
	System.out.println("Child");		
		}	
}

class Child2 extends Base{
	int c2mark=349;
	
		public void Sub2() {
	System.out.println("Child");		
		}	
}

public class Driver {
	
public static void main(String[] args) {
	Base a = new Child(); // UpCasting

	
System.out.println(a.pmark);
 //System.out.println(a.cmark);    // Cannot access subClass variables using UpCasted Reference Variable
a.Parent();
Child c =(Child)a;  // c can access both super and sub class properties

System.out.println(c.pmark);
System.out.println(c.cmark);
c.Parent();
c.Sub();
	
}
}