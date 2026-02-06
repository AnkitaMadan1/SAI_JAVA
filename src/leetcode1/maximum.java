package leetcode1;

public class maximum {

	public static int maximum(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(maximum(a));

	}

}
