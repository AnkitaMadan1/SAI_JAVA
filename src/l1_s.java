
public class l1_s {

	public static boolean isPalindrome(String s) {

		// Step 1: Clean the string
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		// Step 2: Compare characters
		while (left < right) {

			// If mismatch found → NOT palindrome
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

			// Move inward
			left++;
			right--;
		}

		// Step 3: All matched → palindrome
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

}
