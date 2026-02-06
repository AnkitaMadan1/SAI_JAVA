package leetcode2;

public class reverse_1 {

	public static void reverse(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		reverse(a);

	}

}
