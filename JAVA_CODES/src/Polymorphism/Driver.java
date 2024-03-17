package Polymorphism;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

public class Driver {
	public static void main(String args[]) {
		Bank b;
		b = new SBI(); // upcasting
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI(); // upcasting
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS(); // upcasting
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}
}
