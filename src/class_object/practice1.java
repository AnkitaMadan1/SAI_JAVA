package class_object;

class car {
	String brand;
	String color;

	void drive() {
		System.out.println(brand + " in " + color + " color is the best car");
	}
}

public class practice1 {

	public static void main(String[] args) {
		car O1 = new car();
		O1.brand = "Hundai";
		O1.color = "White";
		O1.drive();

		car O2 = new car();
		O2.brand = "kia";
		O2.color = "Black";
		O2.drive();

	}

}
