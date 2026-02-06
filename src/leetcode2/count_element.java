package leetcode2;

public class count_element {

	public static int count(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;

		}
		return count;

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		System.out.println(count(a));

	}

}
