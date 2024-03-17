package this_Keyword;
/*
 * 
 *  
 *  2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword.
 If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
  Let's see the example
 */
class A{  
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  
}  
}  
class Test{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}}  