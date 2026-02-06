package New;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	boolean a =sc.hasNext();
	System.out.println(a);
	boolean b = sc.hasNextInt();
	System.out.println(b);
	System.out.println("Enter the number");
	int c = sc.nextInt();
	System.out.println("Enter the number");
	int d = sc.nextInt();
	int sum = c+d;
	System.out.println(sum);
			
		
		
		
		

	}

}
