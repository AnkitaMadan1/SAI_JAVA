package finalleetcode;

public class missing_1 {

	public static int missing(int[] arr) {

		int sum = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			int n = arr.length + 1;
			int total = n * (n + 1) / 2;
			result = total - sum;

		}
		return result;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4 };
		System.out.println(missing(a));

	}

}
