package leetcode;

public class odd_even {
	public static void odd_even(int[] a) {

		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				even++;

			} else {
				odd++;
			}

		}
		System.out.println(odd);
		System.out.println(even);

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 9 };
		odd_even(a);

	}

}
