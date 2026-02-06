package practice;

public class reverse_string {

	public void reverse(char[] s) {

		int left = 0;
		int right = s.length - 1;

		char text = s[left];
		s[left] = s[right];
		s[right] = text;

		left++;
		right--;

	}

	public static void main(String[] args) {

		reverse_string obj = new reverse_string();
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		obj.reverse(s);
		for (char c : s) {
			System.out.print(c);
		}

	}

}
