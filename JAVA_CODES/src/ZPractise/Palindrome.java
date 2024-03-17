package ZPractise;

import LangPackage.Equals;

public class Palindrome {
public static void main(String[] args) {
	Palindrome p = new Palindrome();
	String s = "refer";
	String s2 = p.reverse(s);
	System.out.println(s2);
	if(s.equals(s2)) 
		System.out.println("Its is a Palindrome!");
	else
		System.out.println("It's Not!");
}


static String reverse(String str) {
	String s2 = "";
	for(int i=str.length()-1;i>=0;i--) {
		char ch = str.charAt(i);
		s2 = s2+ch;
	}
	return s2;
}
}