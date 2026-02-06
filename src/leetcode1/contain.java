package leetcode1;

public class contain {

	public static boolean contain(int[] arr) {

		int value = 3;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		int[] a = { 3, 7, 1, 9, 4, 5 };
		System.out.println(contain(a));

	}

}
