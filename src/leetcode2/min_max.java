package leetcode2;

public class min_max {

	public static void min_max(int[] arr) {

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("The max element in an array: " + max);
		System.out.println("The min element in an element: " + min);

	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 9, 1 };
		min_max(a);

	}

}
