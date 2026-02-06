package day1;

public class o2 {

	public static void main(String[] args) {

		String str = "Interview";
		String s = str.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			} else {
				System.out.println(c);
			}
		}
		System.out.println("Total vowel" + count);
	}

}
