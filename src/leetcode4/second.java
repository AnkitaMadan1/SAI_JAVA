package leetcode4;

public class second {

	public static int second(int[] arr) {
		int min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (sec_min > arr[i] && min != arr[i]) {
				sec_min = arr[i];
			}
		}

		return sec_min;

	}

	public static void main(String[] args) {
		int[] a = { 8, 3, 6, 2, 3, 9 };
		System.out.println(second(a));

	}

}
