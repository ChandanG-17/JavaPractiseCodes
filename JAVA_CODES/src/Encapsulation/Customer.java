package Encapsulation;

public class Customer {
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.getBalance());  //ABSTRACTION
		b.setBalance(1500f);   ////ABSTRACTION
		System.out.println(b.getBalance());  ////ABSTRACTION
	}

}
