package ZPractise;

import java.util.Scanner;

public class Primenumber {
 public static void main(String[] args) {
	 System.out.println("Pgm to print first n prime number");
	System.out.println("Enter the value of n:");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println("First "+n+" prime number are: ");
	int count = 0;
	for(int i=2;i<=n;i++) {
		if(count<n) {  
			if(isPrime(i,2)) {          // it is default true
				System.out.println(i);
				count++;
			}
		}
		else {
			System.out.println("\n");
			break;
		}
	}
}

private static boolean isPrime(int num, int j) {
	if (num==j) 
		return true;
	else if(num%j == 0)
		return false;
	j++;
	return isPrime(num,j);
}
} 






