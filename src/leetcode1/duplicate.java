package leetcode1;

public class duplicate {
	public static void duplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;

				}
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 4, 5, 5 };
		duplicate(a);

	}

}
