package TypeCasting;

public class Narrowing {
	public static void main(String[] args) {
		float Number =12453.45f;
		byte No= (byte)Number;// Narrowing should be done explicitly
		System.out.println(Number);
		System.out.println(No);
	}

}
