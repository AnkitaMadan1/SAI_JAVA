package Introduction;

import java.util.Scanner;

public class hasint_input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		boolean num = sc.hasNextInt();
		System.out.println(num);

	}

}
