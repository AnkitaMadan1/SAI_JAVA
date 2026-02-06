package leetcode;

public class averagearray {
	public static int avg(int[] arr) {

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = sum / arr.length;
		}
		return avg;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(avg(a));

	}

}
