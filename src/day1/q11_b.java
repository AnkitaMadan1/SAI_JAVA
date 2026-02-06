package day1;
import java.util.Scanner;
public class q11_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char character = sc.next().charAt(0);
		
		 char ch = Character.toLowerCase(character);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|ch=='u') {
			 System.out.println("It is a vowel");
		 }
		 else if(ch>='a' && ch<='z') {
			 System.out.println("It is consonant");
		 }
		 else {
			 System.out.println("It is an alphabet letter");
		 }
		
		sc.close();
        
	}
}
