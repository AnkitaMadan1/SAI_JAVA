package leetcode1;

public class count_1 {
	public static void count(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			boolean counted = false;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					counted = true;
					break;
				}
			}

			if (!counted) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] + " -> " + count);
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3 };
		count(arr);

	}

}
