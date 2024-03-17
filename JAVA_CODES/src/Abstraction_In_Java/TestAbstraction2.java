package Abstraction_In_Java;
/*
 * 
 * An abstract class can have a data member,
 *  abstract method, method body (non-abstract method), constructor, and even main() method.
 */
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike1{  
 Bike1(){  // Constructor
	 System.out.println("bike is created");
	 }  
 abstract void run();  
 void changeGear(){
	 System.out.println("gear changed");
	 }  
}  
//Creating a Child class which inherits Abstract class  
class Honda1 extends Bike1{
	 Honda1() {
		super();
		
	}
void run(){
	
	System.out.println("running safely..");
	}  
}  
//Creating a Test class which calls abstract and non-abstract methods  
class TestAbstraction2{  
public static void main(String args[]){  
Bike1 obj = new Honda1();  
obj.run();  
obj.changeGear();  
}  
}  