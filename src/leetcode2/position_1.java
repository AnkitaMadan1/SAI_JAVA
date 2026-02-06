package leetcode2;

public class position_1 {

	public static int[] reverse(int[] arr) {

		int left = 0;
		int right = arr.length-1;

		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}
		return arr;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] result = reverse(a);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

}
