
public class palindrone_1 {

	public String ispalindrone(String s) {

		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return "palindrone";
			}
			left++;
			right--;

		}
		return "palindrone";

	}

	public static void main(String[] args) {

		palindrone_1 obj = new palindrone_1();
		String word = obj.ispalindrone("madam");
		System.out.println(word);

	}

}
