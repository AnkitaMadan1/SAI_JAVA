package day1;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Person is adult");

		} else {
			System.out.println("Person is not Adult");
		}
		sc.close();
	}

}
