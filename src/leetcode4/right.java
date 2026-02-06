package leetcode4;

public class right {

	public static void count(int[] arr) {

		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;

			} else {
				odd++;
			}

		}
		System.out.println("The count of even numbers in an element: " + even);
		System.out.println("The count of odd numbers in an element: " + odd);

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		count(a);

	}
}
