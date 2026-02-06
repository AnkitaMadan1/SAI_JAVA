package leetcode1;

public class duplicat {
	public static boolean duplicate(int[] arr) {

		boolean duplicate = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					duplicate = true;
				}
			}

		}
		return duplicate;

	}

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 3, 5, 2, 5 };
		System.out.println(duplicate(a));

	}

}
