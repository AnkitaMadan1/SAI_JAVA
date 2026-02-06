package leetcode4;

public class reverse {

	public static void reverse(int[] arr) {

		// int[] rev = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		reverse(a);

	}

}
