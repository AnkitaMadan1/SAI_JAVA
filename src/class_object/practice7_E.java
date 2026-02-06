package class_object;

class student2 {
	private String name;
	private int age;

	student2(String name, int age) {
		this.name = name;
		setage(age);
	}

	public String getname() {
		return name;

	}

	public int getage() {
		return age;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		if (age > 0) {
		
		} else {
			System.out.println("not valid");
		}
	}
}

public class practice7_E {

	public static void main(String[] args) {

		student2 q1 = new student2("Ankita", 34);
		System.out.println(q1.getage());
		System.out.println(q1.getname());
		q1.setage(22);
	
		q1.setname("hello");
		
	}

}
