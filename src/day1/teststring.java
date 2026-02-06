package day1;

public class teststring {

	public static void main(String[] args) {
		
		String text = "Hello";
		char[] word = text.toCharArray();
		int count =0;
		
		for(int i=0; i<word.length-1;i++) {
		   char a = word[i];
			for (int k=0; k<word.length-1;k++) {
				
		char b = word [k];
		if (b == a) {
			count++;
		}
		
				
			}
			
			
		}
		System.out.println(count - text.length());

	}

}

