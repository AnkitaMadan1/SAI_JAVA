package leetcode;

public class rev_arr {

	public static int[] reverse(int[] a) {

		// declare an rev array variable

		int[] rev = new int[a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			rev[j] = a[i];
			j++;

		}
		return rev;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] result = reverse(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
