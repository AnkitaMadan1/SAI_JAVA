public class test {

	public static void reversevalue(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;

		}

	}

	public static void main(String[] args) {

		char[] word = { 'h', 'e', 'l', 'l', 'o' };
		reversevalue(word);
		System.out.println(word);

	}

}
