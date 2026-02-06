package learning_Phase;

public class method_constructor {

	int a = 10, b = 20;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		System.out.println(x + y);

	}

	void sum(int x, double y) {
		System.out.println(x + y);
	}

	void sum(double y, int x) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		method_constructor Q1 = new method_constructor();
		{
			Q1.sum();
			Q1.sum(5.8, 10);
			Q1.sum(10, 30.5);
			Q1.sum(20, 40); 
		}
        
	}

}
