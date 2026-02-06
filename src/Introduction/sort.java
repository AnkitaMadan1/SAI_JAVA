package Introduction;

public class sort {
	static int logic(int x, int y) {
		int z;
		if (x > y) {
			z = x + y;
		} else {
			z = (x + y) * 5;
		}

		return z;
	}

	public static void main(String[] args) {
		int a = 14;
		int b = 7;
		int c;
		c = logic(a,b);
		System.out.println(c);

	}

}
