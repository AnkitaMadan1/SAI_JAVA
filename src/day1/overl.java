package day1;

class test1 {

	public void a() {
		System.out.println("method of a");
	}
}

class test2 extends test1 {
	@Override
	public void a() {
		//super.a();
		System.out.println("method of b");
	}

}

public class overl {

	public static void main(String[] args) {

		/*
		 * test1 obj = new test1(); obj.a();
		 */
		test2 obj2 = new test2();
		
		obj2.a();

	}

}
