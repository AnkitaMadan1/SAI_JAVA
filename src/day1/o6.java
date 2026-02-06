package day1;

public class o6 {

	public static void main(String[] args) {
		String s = "Java is very powerful";
		String[] words = s.split(" ");

		String small = words[0];
		String large = words[0];

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < small.length()) {
				small = words[i];
			}
			if (words[i].length() > large.length()) {
				large = words[i];
			}
		}

		System.out.println("Smallest: " + small);
		System.out.println("Largest: " + large);
	}
}
