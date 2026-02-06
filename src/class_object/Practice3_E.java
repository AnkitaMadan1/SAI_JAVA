package class_object;

class Student {
	String name;
	int age;

	void m1() {
		System.out.println(name + " is thestudent of " + age);

	}
}

public class Practice3_E {

	public static void main(String[] args) {
		
		Student q1 = new Student();
		q1.name= "Ankita";
		q1.age = 25;
		q1.m1();
		
		Student q2 = new Student();
		q2.name = "nokia";
		q2.age = 41;
		q2.m1();
	}

}
