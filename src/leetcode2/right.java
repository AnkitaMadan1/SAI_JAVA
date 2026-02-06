package leetcode2;

public class right {
	public static int[] right(int[] arr) {

		int num = arr[arr.length - 1];
		for (int i = 0; i < arr.length-1; i++) {
			 arr[i]= arr[i-1];
		}
		arr[0] = num;
		return arr;

	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] result = right(a);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
