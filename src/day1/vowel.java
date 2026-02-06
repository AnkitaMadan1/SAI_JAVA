package day1;

public class vowel {

	public String vowel(String str) {
		return str.replaceAll("[aeiouAEIOU]", " ");
	}

	public static void main(String[] args) {

		vowel obj = new vowel();

		System.out.println(obj.vowel("Interview"));

	}

}
