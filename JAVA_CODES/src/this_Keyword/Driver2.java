package this_Keyword;
/* 
 * 3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. 
It is used to reuse the constructor. In other words, it is used for constructor chaining.
 */

class A1{  
A1(){
	System.out.println("hello a");
	}  
A1(int x){  
this();  // constructor Chaining
System.out.println(x);  
}  
}  
class Driver2{  
public static void main(String args[]){  
A1 a=new A1(10);  
}}  