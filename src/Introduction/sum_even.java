package Introduction;

public class sum_even {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while (i <= 20) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of the values:" + sum);
	}

}
