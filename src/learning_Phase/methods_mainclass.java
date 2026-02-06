package learning_Phase;

public class methods_mainclass {

	public static void main(String[] args) {

		methods_detail a1 = new methods_detail();
		// calling 1 st method
		a1.m1();
        // calling 2 nd method
		String stat = a1.m2();
		System.out.println(stat);

		// calling 3rd method
		a1.m3("Ankita");
		
		// calling 4th method
		
		String value1 = a1.m4(1,22, "Papa");
		System.out.println(value1);

	}

}
