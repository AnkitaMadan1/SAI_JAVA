package finalleetcode;

public class odd {
	public static int odd(int[] arr) {
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd++;

			}
		}
		return odd;

	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 1, 6 };
		System.out.println(odd(a));

	}

}
