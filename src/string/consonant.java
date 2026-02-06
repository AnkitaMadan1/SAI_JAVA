package string;

public class consonant {

	public static int consonant(String arr) {

		int count = 0;

		for (int i = 0; i < arr.length(); i++) {

			char ch = Character.toLowerCase(arr.charAt(i));
			if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		String name = "Education";
		System.out.println(consonant(name));

	}

}
