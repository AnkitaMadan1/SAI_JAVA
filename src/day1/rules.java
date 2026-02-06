package day1;

public class rules implements trafficrules, traffic {

	public static void main(String[] args) {

		trafficrules obj = new rules();

		obj.greengo();
		obj.redstop();
		obj.yellowwait();
		
		rules obj1 = new rules();
		obj1.crossing();
		
		traffic obj2 = new rules();
		obj2.people();

	}

	@Override
	public void greengo() {
		System.out.println("This method is for moving");

	}

	@Override
	public void redstop() {
		System.out.println("This method is for stopping");

	}

	@Override
	public void yellowwait() {
		System.out.println("This method is for waiting");

	}
	public void crossing() {
		System.out.println("crossing");
	}

	@Override
	public void people() {
		System.out.println("People");
		
	}

}
