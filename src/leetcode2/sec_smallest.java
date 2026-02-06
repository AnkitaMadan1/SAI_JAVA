package leetcode2;

public class sec_smallest {
	public static int small(int[] arr) {

		int smallest = arr[0];

		int second_smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (second_smallest > arr[i] && arr[i] != smallest) {
				second_smallest = arr[i];
			}
		}
		return second_smallest;

	}

	public static void main(String[] args) {
		int[] a = { 5, 2, 8, 1, 3 };
		System.out.println(small(a));
	}

}
