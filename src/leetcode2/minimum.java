package leetcode2;

public class minimum {

	public static int minimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 9, 1 };

		System.out.println(" The minimum eleent in an array:" + minimum(a));

	}

}
