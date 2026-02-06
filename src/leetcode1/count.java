package leetcode1;

public class count {

	public static void total(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			System.out.println(arr[i] + "->" + count);
			count=0;

		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 3, 3 };
		total(a);

	}

}
