package leetcode;

public class totalcharacters {

	public static int total(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String s = "Hello Java";
		System.out.println("The length of characters: " + total(s));

	}

}
