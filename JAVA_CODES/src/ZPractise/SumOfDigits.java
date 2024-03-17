package ZPractise;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int d,sum =0;
		while(num>0) {
			d = num%10;
			sum = sum + d;
			num = num /10;
		}
		System.out.println(sum);
	}

}
