package leetcode;

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
		int[] a = { 92, 54, 76, 34, 65 };
		System.out.println(minimum(a));

	}

}
