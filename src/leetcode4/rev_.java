package leetcode4;

public class rev_ {

	public static int[] rev(int[] arr) {

		int left = 0;
		int right = arr.length-1;
		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 9, 2, 6, 3, 8 };
		int[] result = rev(a);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
	}

}
}
