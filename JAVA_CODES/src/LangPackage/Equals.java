package LangPackage;

public class Equals {
	

public static void main(String[] args) {
	String s1 = new String("abc");
	String s2 = new String("abc");
	Equals e1 = new Equals();
	Equals e2 = new Equals();
	System.out.println(e1.equals(e2));// false 
	System.out.println(s1.equals(s2));//true
	StringBuilder sb1 = new StringBuilder("abc");
	StringBuilder sb2 = new StringBuilder("abc");
	System.out.println(sb1.equals(sb2));//false

}
}
