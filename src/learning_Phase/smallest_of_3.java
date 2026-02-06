package learning_Phase;

public class smallest_of_3 {

	public static void main(String[] args) {

		int a = 34;
		int b = 67;
		int c = 16;

		if (a < b && a < c) {
			System.out.println("a is smallest ");
		}

		else if (b < c && b < a) {
			System.out.println("b is smallest");
		}

		else {
			System.out.println("c is the smallest");
		}

	}
}
