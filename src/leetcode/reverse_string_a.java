package leetcode;

public class reverse_string_a {
	public static String reverseword(String s) {

		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);

		}
		return reverse;

	}

	public static void main(String[] args) {

		String s = "cat";
		if (s.equalsIgnoreCase(reverseword(s))) {
			System.out.println("is palindrone");
		} else {
			System.out.println("is not palindrone");
		}

	}

}
