package day1;

//attribute
class test {

	private int side;

	// constructor

	/*public test(int myside) {
		this.side = myside;
	}*/
	
	public test() {
		 this.side = 2;
	}

	// method
	public void setarea(int s) {
		this.side = s;
	}

	public int getarea() {
		return side * side;

	}

}

public class cons {

	public static void main(String[] args) {

		test obj = new test();
		// obj.setarea(3);
		System.out.println(obj.getarea());

	}

}
