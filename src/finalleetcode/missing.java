package finalleetcode;

public class missing {
	public static int missing(int[] arr) {
		int second = 0;

		for (int i = 0; i < arr.length; i++) {

			int first = arr[i + 1] - arr[i];
			second = arr[i + 1] + first;
			break;

		}
		return second;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4 };
		System.out.println(missing(a));

	}

}
