package day1;

public class average {
	public static int avg(int[] arr) {

		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = sum / 2;

		}
		return avg;

	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 9, 4, 3 };
		System.out.println(avg(a));

	}

}
