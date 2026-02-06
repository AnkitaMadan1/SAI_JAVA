package day1;

public class d1 {

	public static void main(String[] args) {
		String str = "Interview";
		String rev = " ";
		for (int i = 0; i < str.length(); i++) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

}
