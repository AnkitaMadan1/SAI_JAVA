package finalleetcode;

import leetcode2.minimum;

public class sec_largest {
	public static int sec_largest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (second < arr[i] && largest != arr[i]) {
				second = arr[i];
			}

		}
		return second;

	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 1, 9, 5, 3 };
		System.out.println(sec_largest(a));

	}

}
