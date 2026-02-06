package Introduction;
import java.util.Scanner;
public class multiply_of_2 {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int i = 1;
		int fact = 1;
		while(i<=n) {
		fact = fact*i;	
		i++;
		}
		System.out.println(fact);

	}

}
