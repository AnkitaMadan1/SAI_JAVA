package leetcode1;

public class value {

	public static boolean value(int[] a) {

		boolean contain = false;
		int value = 7;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				contain = true;
				// System.out.println(a[i]);
				break;

			}
		}
		return contain;

	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 8, 9 };
		System.out.println(value(a));
	}

}
