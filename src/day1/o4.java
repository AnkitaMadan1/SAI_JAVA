package day1;

public class o4 {

	public static void main(String[] args) {
//reverse word in sentence
		String s = "I love Java";
		String[] word = s.split(" ");
		String rev = " ";

		for (int i = word.length - 1; i >= 0; i--) {
			rev = word[i] + rev + " ";
		}
		System.out.println(rev.trim());
	}

}
