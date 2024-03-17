package Static_Method;

/*Restrictions for the static method
There are two main restrictions for the static method. They are:

1.The static method can not use non static data member or call non-static method directly.
2. this and super cannot be used in static context.
*/
class A{  
	 int a=40;//non static  
	   
	 public static void main(String args[]){  
// System.out.println(a);
		 /*CTE as we cannot access non-static variable inside static variable directly
		  we should create the instance of a class(Object) and then access them in static block*/
	 }  
	}     

/*
Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method,
 JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
*/