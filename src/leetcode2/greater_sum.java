package leetcode2;

public class greater_sum {

	public static int greater_sum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 5) {
				sum = sum + arr[i];
			}

		}

		return sum;

	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 1, 8 };
		System.out.println(greater_sum(a));

	}

}
