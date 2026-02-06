package day1;

public class array_dim {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		a[2][0] = 1;
		a[2][1] = 9;
		a[2][2] = 2;
		int min = a[0][0];
		int minrow = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minrow = i;

				}

			}

		}
		System.out.println("The min number in the array is: " + min);
		System.out.println("The minrow number in the array is: " + minrow);

		int max = a[minrow][0];
		for (int j = 0; j < 3; j++) {
			if (a[minrow][j] > max) {
				max = a[minrow][j];
			}

		}
		System.out.println(max);
	}
}
