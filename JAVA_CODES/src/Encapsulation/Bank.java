package Encapsulation;
// 1. Wraping up Data and Object in a single unit is called encapsulation
//2. Entity which follow security and abstraction is called encapsulated entity
//3. The Java Bean class is the example of a fully encapsulated class
public class Bank {
	private float Balance=23456.78f;// SECURITY

	public void setBalance(float amtWithdrawn)
	{
		
		this.Balance= this.Balance - amtWithdrawn;
		
	}
	public float getBalance()
	{
		System.out.println(" Current Balance = "+ Balance);
		return Balance;
	}
	public static void main(String[] args) {
		
	}

	

}
