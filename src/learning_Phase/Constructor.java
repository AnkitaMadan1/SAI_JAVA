package learning_Phase;

class person {
	String name;
	int age;

	person(String n, int a) {
		name = n;
		age = a;
	}

	void display() {
		System.out.println(name + "   " + age);

	}

}

public class Constructor {

	public static void main(String[] args) {

		person p1 = new person("Ankita", 22);
		p1.display();
		// System.out.println(p1.name);
		// System.out.println(p1.age);

	}

}
