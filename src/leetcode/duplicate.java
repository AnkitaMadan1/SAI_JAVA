package leetcode;

public class duplicate {

	public static void duplicate(int[] arr) {

		//boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println(arr[i]);
					//found = true;
					//break;

				}
			}
		}
		//if (!found) {
			//System.out.println("no duplicate");
		}

	

	public static void main(String[] args) {
		int[] a = { 23, 23, 56, 47, 98, 98 };
		duplicate(a);

	}

}
