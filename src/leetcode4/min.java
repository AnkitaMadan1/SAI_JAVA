package leetcode4;

public class min {

	public static int min(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		return min;

	}

	public static void main(String[] args) {
		int[] a = { 8, 3, 6, 2, 9 };
		System.out.println("THe minimum value in an element:" + min(a));

	}

}
