package learning_Phase;

import java.util.Scanner;

public class Unchecked_exemption {

	public static void main(String[] args) {
		System.out.println("Program is executed");
		Scanner sc = new Scanner(System.in);

		// Example 1
		System.out.println("Enter a number"); // Arithmetic Exemption
		int num = sc.nextInt();
		System.out.println(100 / num); // terminate below statement program is completed

		System.out.println("Program is completed");

		// Example 2
		int[] a = new int[5];

		System.out.println(" Enter a position(0-4 ");
		int pos = sc.nextInt();

		System.out.println("Enter the value");
		int value = sc.nextInt();

		a[pos] = value;
		System.out.println(a[pos]);// Index array out of bound

		// Example 3

		String s = "1234"; // Number Format exemption
		int d = Integer.parseInt(s);
		System.out.println(d);

		// Example 4
		String g = null;
		System.out.println(g.length()); // Null Pointer Exemption

	}

}
