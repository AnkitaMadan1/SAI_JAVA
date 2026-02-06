package day1;

public class aaa {

	int a = 10;

	public void text() {
		int a = 20;
		System.out.println(this.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		aaa obj = new aaa();
		obj.text();

	}

}
