package LangPackage;

public class HashCode {
//	public int  hashCode()
//	{
//		return 1234;
//	}
//	public String toString() {
//		return "hi";
//	}
	public static void main(String[] args) {
		HashCode h = new HashCode();
		HashCode i = new HashCode();

		System.out.println(h.hashCode());
		System.out.println(h.toString());
		System.out.println(i);
		System.out.println(i.hashCode());
	}

}
