package leetcode2;

public class maximum {

	public static int maximum(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}

		}
		return max;

	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 9, 1 };
		System.out.println("The maximum value in an array: " + maximum(a));

	}

}
