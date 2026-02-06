package Introduction;

import java.util.Scanner;

public class String_input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Hello, " + name + " have a good day");

	}

}
