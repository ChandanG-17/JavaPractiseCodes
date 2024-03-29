package Super_Keyword;

/*2) super can be used to invoke parent class method
The super keyword can also be used to invoke parent class method. 
It should be used if subclass contains the same method as parent class. 
In other words, it is used if method is overridden.
*/
class Animal1{  
void eat(){System.out.println("eating...");}  
}  
class Dog1 extends Animal1{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dog1 d=new Dog1();  
d.work();  
}}  