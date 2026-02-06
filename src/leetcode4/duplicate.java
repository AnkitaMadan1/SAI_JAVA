package leetcode4;

public class duplicate {

	public static void removeduplicate(int[] arr) {

		
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(arr[i]+ " ");
			}

		}
		;

	}

	public static void main(String[] args) {
		int[] a = { 8, 3, 6, 2, 3, 9, 8 };
		removeduplicate(a);

	}

}
