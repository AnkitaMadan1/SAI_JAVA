
package learning_Phase;

class A {
	int a = 10;

	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b = 20;

	void show() {
		System.out.println(b);
	}
}

	class C extends B {
		int c = 30;

		void print() {
			System.out.println(c);
		}
	}


public class inheritance_class {
	public static void main(String[] args) {
		/*B obj = new B();
		obj.display(); // prints 10
		obj.show(); // prints 20
		System.out.println(obj.b);
		System.out.println(obj.b);*/
		
		C obj1 = new C();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		
		obj1.display();
		obj1.print();
		obj1.show();
		
		
		
		
		
		
		
	}
}
