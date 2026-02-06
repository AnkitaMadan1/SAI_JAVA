package Introduction;
import java.util.Scanner;
public class exercise_input {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks of subject1");
	int sub1= sc.nextInt();
	System.out.println("Enter the marks of subject2");
	int sub2=sc.nextInt();
	System.out.println("Enter the marks of subject3");
	int sub3 = sc.nextInt();
	System.out.println("Enter the marks of subject4");
	int sub4 = sc.nextInt();
	System.out.println("Enter the marks of subject5");
	int sub5 = sc.nextInt();
	int sum = sub1+sub2+sub3+sub4+sub5;
	double result = (sum/500.0)*100.0;
	System.out.println(result);
	}

}
