package day1;

class base {
//base class
	base() {
		System.out.println("I am a base class constructor");
	}

	base(int a) {
		System.out.println("I am an base class overloaded constructor " + a);
	}

}

//derived class

class derived extends base {

	derived() {
		// super(8);
		System.out.println("I am a derived class constructor");
	}

	derived(int a, int y) {
		super(a);
		System.out.println("I am a derived class overloaded constructor " + y);
	}
}

public class s_cons {

	public static void main(String[] args) {

		// derived obj = new derived();
		derived obj = new derived(34, 54);

	}

}
