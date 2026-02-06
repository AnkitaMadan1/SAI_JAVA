package day1;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

	}

}
