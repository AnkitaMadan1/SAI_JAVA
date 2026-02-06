package leetcode1;

public class average {

	public static int average(int[] a) {

		int sum = 0;
		int average = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			average = sum / 2;

		}
		return average;

	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 4, 9 };
		System.out.println(average(a));

	}

}
