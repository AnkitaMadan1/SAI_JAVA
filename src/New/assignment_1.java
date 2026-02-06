package New;

import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		int[] a = {23,46,14,76,25};
		
		System.out.println("*********");
		
		//first question
		System.out.println(a[0]);
		
		System.out.println("*********");
		
		// second question
		System.out.println(a[a.length-1]);
		
		System.out.println("*********");
	    
	    //Third Question
		for(int i=a.length-1; i>=0; i--) {
		   System.out.println(a[i]);  	
		}
		System.out.println("*********");
		
		//Forth question
	    System.out.println(a.length);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
