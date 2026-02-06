package class_object;

class Laptop {
	String brand;
	int price;

	Laptop(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	void showdetails() {
		System.out.println(brand + " is laptop name and its price is : " + price);
	}
}

public class practice6_E {

	public static void main(String[] args) {

		Laptop[] laptop = { new Laptop("Acer", 2500), new Laptop("lenova", 3009), new Laptop("samsung", 7000),
				new Laptop("dell", 7430)

		};
		// enhanced for loop
		for (Laptop l : laptop) {
			l.showdetails();
		}

	}

}
