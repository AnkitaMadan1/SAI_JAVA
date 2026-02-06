package leetcode1;

public class common {
	public static void common(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 4, 5, 8, 8 };
		common(a);

	}

}
