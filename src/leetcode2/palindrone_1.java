package leetcode2;

public class palindrone_1 {

	public static boolean palindrone(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;

			}
			left++;
			right--;

		}
		return true;

	}

	public static void main(String[] args) {
		// int[] a = { 1, 2, 3, 2, 1 };
		int[] b = { 1, 2, 3, 4 };

		System.out.println(palindrone(b));
	}

}
