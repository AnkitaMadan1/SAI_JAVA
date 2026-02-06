package day1;

import java.util.Scanner;

public class max_arr {

	public static void main(String[] args) {

		// string reverse
		// max , min - array
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking the input of Variable from User A");
		int a = sc.nextInt();
		System.out.println("Taking input of variable from User B");
		int b = sc.nextInt();
		System.out.println("Taking input of variable from user C");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("A is the largest");
		} else if (b > a && b > c) {
			System.out.println("B is the largest");
		} else {
			System.out.println("C is the largest");
		}

	}

}
