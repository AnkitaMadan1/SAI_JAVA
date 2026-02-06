package leetcode4;

public class sec_largest {

	public static int sec_largest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];

			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (second < arr[i] && largest != arr[i]) {
				second = arr[i];

			}
		}
		return second;

	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 25, 8, 3 };
		System.out.println(sec_largest(a));

	}

}
