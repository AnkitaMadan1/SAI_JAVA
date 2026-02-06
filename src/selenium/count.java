package selenium;

public class count {

	public static void main(String[] args) {
		String s = "Madan";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')

				count++;

		}
		System.out.println(count);

	}

}
