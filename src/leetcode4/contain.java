package leetcode4;

public class contain {
	public static boolean contain(int[] arr) {

		boolean found = false;
		int contain = 2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != contain) {
				found = false;

			} else {
				found = true;
				
				
			}

		}
		return found;

	}

	public static void main(String[] args) {
		int[] a = { 3, 5, 7, 9 };
		System.out.println(contain(a));

	}

}
