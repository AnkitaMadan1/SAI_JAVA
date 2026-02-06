package leetcode2;

public class by_1 {

	public static int[] position(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];

		}

		arr[arr.length - 1] = temp;
		return arr;

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] result = position(a);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
