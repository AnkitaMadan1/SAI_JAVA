package practice;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // object
		System.out.println("Enter a string"); // user
		String str = sc.nextLine().trim(); // read input string

		String reversed = new StringBuilder(str).reverse().toString();
		if (str.equals(reversed)) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

		sc.close();

	}

}
