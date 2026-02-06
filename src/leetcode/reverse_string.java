package leetcode;

public class reverse_string {

	public static String reversestring(String s) {

		String[] array = s.split(" +");
		StringBuilder builder = new StringBuilder();
		for (int i = array.length - 1; i >= 0; i--) {
			builder.append(array[i]);
			builder.append(" ");

		}
		return builder.toString().trim();

	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reversestring(s));

	}

}
