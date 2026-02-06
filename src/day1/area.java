package day1;

class square2 {

	int side;

	public int getarea() {
		return side * side;
	}

	public void setside(int s) {
		this.side = s;

	}

	public int getperimeter() {
		return 4 * side;
	}
}

public class area {

	public static void main(String[] args) {
		square2 obj = new square2();
		obj.setside(6);
		System.out.println(obj.getarea());

		System.out.println(obj.getperimeter());
	}

}
