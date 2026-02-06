package leetcode1;

public class array_sorted {

	public static boolean sorted(int[] arr) {

		boolean sorted = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				sorted = false;
				break;

			}

		}
		return sorted;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 8, 4, 7 };
		int[] b = { 1, 2, 3, 4, 5 };
		// System.out.println(sorted(a));
		System.out.println(sorted(b));

	}
}
