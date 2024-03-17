package Static_Method;


/*A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.
*/
//Java Program to demonstrate the use of a static method.  
class Student{  
   int rollno;  
   String name;  
   static String college = "ITS";  
   //static method to change the value of static variable  
   static void change(){  
   college = "BBDIT";  
   }  
   //constructor to initialize the variable  
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display values  
   void display(){System.out.println(rollno+" "+name+" "+college);}  
}  