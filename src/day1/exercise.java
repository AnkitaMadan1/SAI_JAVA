package day1;

class Employee1 {
	int Salary;
	String name;

	public int getsalary() {
		return Salary;
	}

	public String getname() {
		return name;
	}

	public void setname(String n) {
		name = n;
	}

}

public class exercise {

	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		obj.setname("Ankita Madan");
		obj.Salary = 34000;
		System.out.println("The name is: "+obj.getname());
		System.out.println("The salary of the person: "+ obj.getsalary());

	}

}
