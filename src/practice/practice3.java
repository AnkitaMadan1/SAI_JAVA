package practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();

		boolean isPrime = true;

		if (num1 <= 0) {
			isPrime = false;

		} else {
			for (int i = 2; i <= Math.sqrt(num1); i++) {
				if (num1 % i == 0) {
					isPrime = false;
					break;
				}

			}
		}
		if (isPrime) {
			System.out.println("it is Prime number");
		} else {
			System.out.println("it is not Prime Number");
		}

	}

}
