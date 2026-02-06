package New;

import java.util.Scanner;


public class scannerprogram {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Marks");
    int marks1 =sc.nextInt();
    System.out.println("Enter the marks");
    int marks2 = sc.nextInt();
    System.out.println("Enter the marks");
    int marks3 = sc.nextInt();
    System.out.println("Enter the marks");
    int marks4 = sc.nextInt();
    System.out.println("Enter the marks");
    int marks5 = sc.nextInt();
    int sum = marks1+marks2+marks3+marks4+marks5;
    double avg = sum*100/500;
    System.out.println("The avg of marks:" + avg);
    
   }

}
