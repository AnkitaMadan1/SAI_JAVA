package learning_Phase;

public class keyword {
	int a, b;
	
	
	/*keyword(int x, int y)
	{
	a= x;
	b = y;
	}*/
	
	void setdata(int x, int y)
	{
		a = x;
		b = y;
	}
	
	void display() {
	System.out.println(a);
	System.out.println(b);
	}

	public static void main(String[] args) {
		//keyword th =  new keyword(200, 300);
			//th.display();
		keyword th = new keyword();
		th.setdata(100, 200);
		th.display();
		
	}

}
