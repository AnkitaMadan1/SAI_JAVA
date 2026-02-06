package leetcode2;

public class greater {

	public static int greater(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 3) {
				count++;

			}
		}

		return count;

	}

	public static void main(String[] args) {

		int[] a = { 1, 4, 2, 6, 10, 5 };
		System.out.println("The count greater than 3 in an array: " + greater(a));

	}

}
