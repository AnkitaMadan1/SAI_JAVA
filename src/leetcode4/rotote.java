package leetcode4;

public class rotote {

	public static int[] rotateRight(int[] arr) {

		int last = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = last;
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		rotateRight(a);

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
