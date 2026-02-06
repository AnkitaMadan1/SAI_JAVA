package leetcode;

import java.util.Arrays;

public class longest_substring {

	public static boolean anagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		} else {

			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(anagram("peek", "keep"));

	}

}
