package Introduction;

public class test {
	static int vocal(int a, int b) {
		int z;
		if (a > b) {
			z = a + b;
		} else {
			z = (a + b) * 5;

		}
		return z;
	}

	public static void main(String[] args) {
		int x = 5;
		int y = 9;
		int c;
		c = vocal(x,y);
	}

}
