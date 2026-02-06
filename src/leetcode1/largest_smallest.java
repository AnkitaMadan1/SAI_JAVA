package leetcode1;

public class largest_smallest {

	public static void l_s(int[] arr) {
		int largest = arr[0];
		int smalest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];

			}
			if (smalest > arr[i]) {
				smalest = arr[i];
			}

		}
		System.out.println(smalest);
		System.out.println(largest);

	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 4, 9, 7 };
		l_s(a);

	}

}
