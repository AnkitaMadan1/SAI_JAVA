package finalleetcode;

public class max {

	public static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 8, 1, 9, 3 };
		System.out.println(max(a));

	}

}
