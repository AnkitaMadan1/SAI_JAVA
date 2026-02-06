package day1;

class square1 {

	int side;

	int area() {
		return side * side;
	}

	int perimeter() {
		return 4 * side;
	}

}

public class square {

	public static void main(String[] args) {
		square1 obj = new square1();
		obj.side = 3;
		System.out.println("The are of square: " + obj.area());
		System.out.println("The perimeter of square: " + obj.perimeter());

	}

}
