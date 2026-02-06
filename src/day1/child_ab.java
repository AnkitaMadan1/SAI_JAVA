package day1;

public class child_ab extends parent_ab {

	public static void main(String[] args) {
		
		
		child_ab obj = new child_ab();
		obj.color();
		obj.engine();

	}

	@Override
	public void color() {
		System.out.println("color");

	}

}
