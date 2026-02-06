package leetcode4;

public class sum {
	public static int sum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;

	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		System.out.println("The sum of all element in an array: " + sum(a));

	}

}
