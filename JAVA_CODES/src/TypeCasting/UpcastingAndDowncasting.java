package TypeCasting;

public class UpcastingAndDowncasting {
	// for upcasting inheritance is compulsory
	public static void main(String[] args) {
		
		Parent p = new  Child ();// Upcasting : creating the object of the child 
		                           ///class and storing it with the reference 
		                           //variable of parent class is called upcasting 
		System.out.println(p.Balance);
		System.out.println(p.setAcc(1234));// We can only access the parent class properties
		System.out.println(p.getAcc());
		//System.out.println(p.ChildBalance); // Not possible to access the properties of child class 
		Child d = (Child)p;  // Downcasting explicitly
		System.out.println(d.Balance);// We can only access the parent class properties and child class properties
		System.out.println(d.setAcc(1234));
		System.out.println(d.getAcc());
		
	}

}
