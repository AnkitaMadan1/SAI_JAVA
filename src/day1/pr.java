package day1;

public class pr {

	public static void main(String[] args) {

		for (int r = 1; r<=5; r++) {
			for (int c=5 ; c>=6-r; c--) {
				System.out.print(c +" ");
			}
			System.out.println();
		}

	}

}
