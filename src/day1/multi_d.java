package day1;

public class multi_d {

	public static void main(String[] args) {

		int a[][] = new int[2][3];
		a[0][0] = 3;
		a[0][1] = 5;
		a[0][2] = 17;
		a[1][0] = 45;
		a[1][1] = 43;
		a[1][2] = 90;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
