package leetcode1;

public class od_even {

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
		System.out.println("The even count:" + even);
		System.out.println("The odd count:" + odd);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		odd_even(arr);

	}

}
