package day1;

class Employee {
	String name;
	int id;
	int salary;

	public void Details() {
		System.out.println("My name is: " + name);
		System.out.println("My id is:" + id);
	}

	public int salary() {
		return salary;
	}

}

public class method {

	public static void main(String[] args) {

		Employee harry = new Employee(); // Initializing the objective
		Employee john = new Employee();
		harry.name = "Ankita";
		harry.id = 22;
		harry.salary = 34000;
		john.name = "Madan";
		john.id = 25;
        john.salary = 55000;
		harry.Details();
		john.Details();
		int money = harry.salary();
		System.out.println("The salary of harry:"+ money);
		int money1=john.salary();
		System.out.println("The salary of john:" + money1);

	}

}
