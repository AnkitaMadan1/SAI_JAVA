package New;

import java.util.Scanner;

public class newprogram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for maths:");
		double maths = sc.nextDouble();
		System.out.println("Enter the marks for science:");
		double science = sc.nextDouble();
		System.out.println("Enter the marks for english:");
		int english = sc.nextInt();
		System.out.println("Enter the marks for hindi:");
		int hindi = sc.nextInt();
		System.out.println("Enter the marks for economics:");
		int economics = sc.nextInt();
		double sum = (maths + science + english + hindi + economics);
		System.out.println("The number of subjects: " + 5);
		System.out.println("Total marks obtained:"  + sum);
		System.out.println("The percentage obtained: " + (sum*100/500));

	}

}
