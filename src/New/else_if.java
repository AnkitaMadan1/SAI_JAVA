package New;
import java.util.Scanner;

public class else_if {
	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
	    age = sc.nextInt();
		
		if(age>56) {
			System.out.println("This is good knowledge");
		}
		else if(age>45) {
			System.out.println("This is semi knowledge");
		}
		else if(age>32) {
			System.out.println("This is semi semi knowledge");
		}
		else{
			System.out.println("this is not included");
		}
		
	}
}
