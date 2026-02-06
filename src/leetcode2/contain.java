package leetcode2;

public class contain {

	public static boolean contain(int[] arr) {
		//boolean contain = false;
		int value = 7;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {
				return true;

			}

		}
		return false;

	}

	public static void main(String[] args) {

		int[] a = { 4, 7, 1, 9 };

		System.out.println(contain(a));

	}

}
