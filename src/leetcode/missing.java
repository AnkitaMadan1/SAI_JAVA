package leetcode;

public class missing {
	public static int missing(int[] a) {

		int n = a.length;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		int total = n * (n + 1) / 2;
		int result = total - sum;
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 4, 5 };
		System.out.println("The missing value:" + missing(arr));
	}

}
