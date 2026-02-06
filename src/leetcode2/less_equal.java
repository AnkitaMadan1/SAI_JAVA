package leetcode2;

public class less_equal {

	public static int less_equal(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 5) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int[] a = { 3, 7, 5, 1, 9 };
		System.out.println("The value lessor equal to 5 is: " + less_equal(a));

	}

}
