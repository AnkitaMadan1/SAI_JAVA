package leetcode;

public class max_1 {

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
		int[] a = { 2, 32, 54, 92, 25, 66 };
		System.out.println(max(a));
	}

}
