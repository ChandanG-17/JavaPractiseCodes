package ZPractise;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
//	Factorial f = new Factorial();   // If method is static no need of Object creation!
	System.out.println("Enter the Number: ");
	int a = s. nextInt();
	fact(a);
	fibo(a);
	EvenOdd(a);
	Armstrong(a);
	prime(a);
	
}

private static void prime(int a) {
	int count = 0;
	for(int i=2;i<=a/2;i++) {
		if(a%i==0){
			count++;
			break;
		}
	}
	if(count==0)
		System.out.println("It's prime number");
	else
		System.out.println("It's not prime number");
}

static void fact(int n) {
	int f = 1;
	for(int i=1;i<=n;i++) 
		f = f*i;
	System.out.println("Factorial is:"+f);
}

static void fibo(int n) {
	int f = 0,s=1,t ;
	//System.out.print("Fibonacci series: "+f+" "+s+" ");
	for (int i = 1;i<=n;i++){
		System.out.print(f+" ");
		t = f+s;
		f = s;
		s = t;
		//System.out.print(t+" ");
	}
	System.out.println();
}

static void EvenOdd( int n) {
	if(n%2 == 0) 
		System.out.println(n+" It's Even number!");
	else
		System.out.println(n+" It's Odd number!");
}

static void Armstrong(int n) {
	int t = n,sum = 0;
	int count = count(n);
	while(n>0) {
		int d=n%10;
		sum += getPow(d,count);
		n= n/10;
	}
	if(t==sum) 
		System.out.println("Its Armstrong!");
	else
		System.out.println("Its Not Armstrong!");
}

private static int getPow(int d, int count) {
	int prod = 1;
	for( int i=1;i<=count;i++) 
		prod = d * prod;
	return prod;
}

private static int count(int n) {
	int count = 0;
	do {
		count ++;
		n = n/10;
	}while(n>0);
	return count;
}

}