package learning_Phase;

class bank {
	double roi() {
		return 0;
	}
}

class HDFC extends bank {
	double roi() {
		return 10.25;

	}
}

class Axis extends bank {
	double roi() {
		return 15.87;
	}
}

public class overriding {

	public static void main(String[] args) {
		
		 HDFC  d = new  HDFC();
		System.out.println(d.roi());
			
		Axis e = new Axis();
		System.out.println(e.roi());

	}

}
