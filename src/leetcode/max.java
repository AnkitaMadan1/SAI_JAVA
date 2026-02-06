package leetcode;

public class max {

	public static int maximum(int[] arr) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {

		int[] a = { 1, 5, 3, 8, 13, 4 };
		
		System.out.println("The maximun value in an element: " + maximum(a));

	}

}
