package Has_A_Relationship;

public class Car {
public static void main(String[] args) {
	Engine e  = new Engine();
	System.out.println(e.a);
}
}
class Engine{
	int  a =10;
	Engine(){
		System.out.println("Engine Started!");
	}
}
