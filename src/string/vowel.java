package string;

public class vowel {

	public static int vowel(String arr) {
		int count = 0;

		for (int i = 0; i < arr.length(); i++) {
			char ch = Character.toLowerCase(arr.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

			}

		}
		return count;

	}

	public static void main(String[] args) {
		String arr = "education";
		System.out.println(vowel(arr));

	}

}
