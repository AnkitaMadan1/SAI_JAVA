package leetcode4;

public class reverse_ {
	public static void reverse(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}

	}

	public static void main(String[] args) {
		int[] a = { 8, 3, 6, 2, 9 };
		reverse(a);

	}

}
