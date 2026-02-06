package leetcode1;

public class sum {

	public static int sum(int[] a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 4, 9 };
		System.out.println(sum(a));

	}

}
