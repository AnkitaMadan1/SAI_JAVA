package leetcode1;

public class even_odd {

	public static void even_odd(int[] a) {

		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;

			} else {
				odd++;
			}
		}
		System.out.println("The count of Even Number: " + even);
		System.out.println("The count of odd Number: " + odd);

	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 7, 9, 4, 6 };
		even_odd(a);

	}

}
