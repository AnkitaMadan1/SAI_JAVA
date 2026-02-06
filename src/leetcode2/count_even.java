package leetcode2;

public class count_even {

	public static int output(int[] arr) {

		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			}
		}

		return even;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(output(a));

	}

}
