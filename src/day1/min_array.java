package day1;

public class min_array {

	public static void main(String[] args) {
		int[] arr = { 45, 34, 87, 65, 90 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min)
			min = arr[i];

		}
		System.out.println(min);

	}

}
