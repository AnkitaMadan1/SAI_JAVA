package leetcode;

public class arraycontainvalue {

	public static Boolean contain(int[] arr) {

		int value = 55;

		Boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				found = true;
				break;
			}
		}
		return found;

	}

	public static void main(String[] args) {

		int[] a = { 2, 10, 15, 20, 25 };
		System.out.println(contain(a));

	}

}
