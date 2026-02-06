package practice;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num<=0) {
		isPrime = false;
		
		}
		else {
			for(int i =2; i<=Math.sqrt(num); i++) {
				if(num%2==0) {
					isPrime = false;
					break;
				}
					
			}
		}
		if(isPrime) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("not");
		}
		
		
		

	}

}
