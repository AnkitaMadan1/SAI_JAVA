package leetcode;

public class firstoccurenceString_a {

	public static int firstoccurence(String hamskey, String needle) {

		for (int i = 0; i < hamskey.length() - needle.length() + 1; i++) {

			if (Character.toLowerCase(hamskey.charAt(i)) == Character.toLowerCase(needle.charAt(0))) {
				if (hamskey.substring(i, i + needle.length()).equalsIgnoreCase(needle))
					
				return i;

			}
		}
		return -1;
	}

	public static void main(String[] args) {

		String hamskey = "sadbutsad";
		String needle = "BUT";
		System.out.println(firstoccurence(hamskey, needle));
	}

}
