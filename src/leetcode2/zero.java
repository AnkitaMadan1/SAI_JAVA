package leetcode2;

public class zero {

	public static int[] zero(int[] arr) {

		int[] result = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[j] = arr[i];
				j++;

			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12 };
		int[] test = zero(a);
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}

	}

}
