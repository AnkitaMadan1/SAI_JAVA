package leetcode;

public class palindrone {

	public static void main(String[] args) {

		String s = "level";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("is palindrone");
		} else {
			System.out.println("is not palindrone");
		}

	}
}
