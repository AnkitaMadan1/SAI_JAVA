package day1;

public class vowell {

	public static void main(String[] args) {

		String str = "Interview";
		String str1= str.toLowerCase();
		int count=0;

		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u') {
				count++;
				
				
			}else {
				System.out.println(c);
			}
			
		}
		System.out.println(count);

	}

}
