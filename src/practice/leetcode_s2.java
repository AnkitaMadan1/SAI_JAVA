package practice;

public class leetcode_s2 {

	public static int same(String hamster, String needle) {

		for (int i = 0; i < hamster.length() - needle.length(); i++) {
			if (hamster.charAt(i) == needle.charAt(0)) {
				if (hamster.substring(i, needle.length() + i).equals(needle)) {
					return i;
				}

			}

		}
		return -1;

	}

	public static void main(String[] args) {

		String hamster = "sadbutsad";
		String needle = "sad";

		System.out.println(same(hamster, needle));

	}

}
