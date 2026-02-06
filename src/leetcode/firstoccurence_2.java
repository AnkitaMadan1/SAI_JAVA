package leetcode;

public class firstoccurence_2 {

	public static int firstoccurrence(String hamskey, String needle) {

		for (int i = 0; i <= hamskey.length() - needle.length(); i++) {

			if (hamskey.charAt(i) == needle.charAt(0)
					|| Character.toLowerCase(hamskey.charAt(i)) == Character.toLowerCase(needle.charAt(0))) {

				if (hamskey.substring(i, i + needle.length()).equalsIgnoreCase(needle)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String hamskey = "sadbutsad";
		String needle = "BUT";

		System.out.println(firstoccurrence(hamskey, needle)); // Output: 3
	}

	}

	
