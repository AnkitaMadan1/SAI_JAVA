package learning_Phase;

public class Static {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("this is static method");
	}

	void m2() {
		System.out.println("this is not static keyword");
	}
	
	void m3() {                            // NON-STATIC METHOD
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}


	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		Static st = new Static();      //OBJECT
		System.out.println(st.b);
		st.m2();
		
		st.m3(); // CALLING NON - STATIC METHOD
		

	}

}
