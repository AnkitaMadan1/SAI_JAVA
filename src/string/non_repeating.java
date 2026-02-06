package string;

public class non_repeating {

	public static char count(String str) {

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == current) {
					count++;

				}
				if (count == 1) {
					return current;
				}
			}

		}
		return ' ';

	}

	public static void main(String[] args) {
		String name = "swiss";
		System.out.println(count(name));

	}

}
