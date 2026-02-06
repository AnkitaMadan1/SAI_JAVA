package leetcode1;

public class min {
	public static int minimum(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 8, 3 };
		System.out.println(minimum(a));

	}

}
