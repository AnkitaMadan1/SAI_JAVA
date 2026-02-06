package leetcode2;

public class second_largest {

	public static int sec_largest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (largest < arr[i]) {
				largest = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (second_largest < arr[i] && arr[i] != largest) {
				second_largest = arr[i];

			}

		}
		return second_largest;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 9, 4 };
		System.out.println("The fifth value is the second most largest value in an element: " + sec_largest(a));

	}

}
