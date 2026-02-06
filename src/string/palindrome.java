package string;

public class palindrome {

	public static boolean palindrome(String arr) {

		int left = 0;
		int right = arr.length() - 1;

		while (left < right) {
			if (arr.charAt(left) != arr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {
		String check = "test";
		System.out.println(palindrome(check));

	}

}
