package leetcode2;

public class rotate {

	public static int[] rotate(int[] arr) {
		int num = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = num;
		return arr;

	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] result = rotate(a);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}

	}

}
