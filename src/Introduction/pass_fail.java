package Introduction;

import java.util.Scanner;

public class pass_fail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("marks in sub1");
		float marks1 = sc.nextInt();
		System.out.println("marks in sub1");
		float marks2 = sc.nextInt();
		System.out.println("marks in sub1");
		float marks3 = sc.nextInt();
		float avg = 40.0f;
		avg = (marks1 + marks2 + marks3) / 3.0f;

		System.out.println("THe individual subject result");
		
		if (marks1 > 33) {
			System.out.println("Subject1:Pass");
		} else {
			System.out.println("Subject1:Fail");
		}

		if (marks2 > 33) {
			System.out.println("Subject2: Pass");
		} else {
			System.out.println("Subject2:Fail");
		}
		if (marks3 > 33) {
			System.out.println("Subject3:Pass");
		} else {
			System.out.println("Subject3:Fail");
		}

		System.out.println("The overall result");

		if (avg >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println(avg);
	}

}
