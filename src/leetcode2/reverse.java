package leetcode2;

public class reverse {

	public static int[] reverse(int[] arr) {

		int[] rev = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[j] = arr[i];
			j++;

		}
		return rev;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] result = reverse(a);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
