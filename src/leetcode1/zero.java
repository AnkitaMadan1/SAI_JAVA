package leetcode1;

public class zero {
	public static int[] zero(int[] arr) {

		int j = 0;
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[j] = arr[i];
				j++;

			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 0, 4, 6, 0, 1 };
		int[] result = zero(a);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
