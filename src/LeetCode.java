
public class LeetCode {

	public static int lengthword(String s) {

		String str = s.trim();
		int count = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		String a = "fly to the moon";
		System.out.println("The length of last word in the senetence: " + lengthword(a));

	}

}
