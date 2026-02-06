package leetcode2;

public class time {

	public static int times(int[] arr) {

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
		System.out.println("The number of times element 2 is coming: " + times(a));

	}

}
