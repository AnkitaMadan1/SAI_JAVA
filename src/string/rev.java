package string;

public class rev {

	public static String reverse(String arr) {
		String rev = " ";

		for (int i = arr.length() - 1; i >= 0; i--) {
			rev = rev + arr.charAt(i);
		}
		return rev.trim();

	}

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(reverse(str));

	}

}
