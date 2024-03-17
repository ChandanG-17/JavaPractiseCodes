package Static_Block;

/*Is used to initialize the static data member.
 * It is executed before the main method at the time of classloading. 
 */
class A2{  
	 
	  public static void main(String args[]){  
	   System.out.println("Hello main");  
	  }  
	  static  //Static block will be invoked first
	  {
		  System.out.println("static block is invoked");
		  
	  }  
	}  