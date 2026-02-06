package day1;

public class reverse_words {

	public static void main(String[] args) {

		String sentence = "I Love Java";
		String[] word = sentence.split(" ");
		String rev = " ";

		for (int i = word.length - 1; i >= 0; i--) {
			rev = rev + word[i] + " ";

		}
		System.out.println(rev.trim());

	}
}
