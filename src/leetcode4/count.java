package leetcode4;

public class count {

	public static int count(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 2) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 2 };
		System.out.println("The count of element 2 is: " + count(a));

	}

}
