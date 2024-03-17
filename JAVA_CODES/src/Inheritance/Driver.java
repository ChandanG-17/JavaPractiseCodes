package Inheritance;

// Single-Level Inheritance
class Card{
	int cardNum;
	String cardName;
	int cvv;
	public void swipe() {
		System.out.println("Card is Swiped!");
	}
}
class DebitCard extends Card {
	int cardlimit ;
	public void Limit() {
		System.out.println("Card Limit"+cardlimit);
	}
}
public class Driver{
	public static void main(String[] args) {
		DebitCard dc = new DebitCard();
		dc.cardNum = 1235;
		dc.cardName = "Repay";
		dc.cvv = 613;
		dc.cardlimit = 20000;
		
		dc.swipe();
		dc.Limit();
	}
}

 