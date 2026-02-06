package day1;

public class max_a {

	public static void main(String[] args) {

		int[] a = { 23, 65, 87, 56, 90 };
		int max = a[0];

		for (int i = 1; i <= a.length - 1; i++) {
			if (a[i] > max)
				;
			max = a[i];

		}
		System.out.println("The max number among all: " + max);

	}

}
