package class_object;

// Step1: Created the class
class mobile {

//Step2: Declare the variable
	String mobile;
	int Price;
	static int count=0;

//Step3: Created the constructor

	mobile(String m, int p) {
		mobile = m;
		Price = p;
		count++;
	}

// Step4: Method
	void details() {
		System.out.println(mobile +" phone " +Price);

	}
}

public class Practice2 {

	public static void main(String[] args) {

		mobile m1 = new mobile("Samsung", 1000);
		m1.details();

		mobile m2 = new mobile("Nokia", 4000);
		m2.details();

		mobile m3 = new mobile("Apple", 10000);
		m3.details();
		System.out.println("Total number of values " + mobile.count);

	}

}
