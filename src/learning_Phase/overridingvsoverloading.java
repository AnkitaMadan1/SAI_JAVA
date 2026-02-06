package learning_Phase;

class ABC {
	void m1() {

		System.out.println();
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	void m1(int a, int b ) { 
		System.out.println(a + b);  // overloading
	} 
	
    void m2(int b) {
    	
		System.out.println(b*b); // overriding
    }
}

public class overridingvsoverloading {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		obj.m1();
		obj.m1(10,20);
		obj.m2(10);
		
		 

	}

}
