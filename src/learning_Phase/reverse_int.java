package learning_Phase;

public class reverse_int {

	public static void main(String[] args) {

		int num = 121;
		int value = num;
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}

		if (value == reversed) {
			System.out.println("it is paligrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
