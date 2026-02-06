package leetcode2;

public class sorted {

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
		int[] a = { 1, 2, 3, 5, 1 };
		System.out.println(sorted(a));

	}

}
