package leetcode2;

public class sum {

	public static int sum(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
			sum = sum+arr[i];	
				
			}

		}
		return sum;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6 };
		System.out.println(sum(a));

	}

}
