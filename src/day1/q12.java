package day1;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		boolean isprime = true;

		
		if(n<=1) {
			isprime = false;
		}
		else {
			for(int i=2; i<=n/2; i++) {
				if(i%2==0) {
					isprime = false;
					break;
				}
			}
		}
		
		if(isprime) {
			System.out.println("id prime number");
		}
		else {
			System.out.println("Is not prime number");
		}
		
		
	}
}
