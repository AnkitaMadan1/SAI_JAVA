package learning_Phase;

public class para_constructor {


	// constructor 2 types
		// 1. default   2. paramerized
		int x;
		int y;

	para_constructor() // default constructor
	{
		x = 20;
		y = 30;
	}

	para_constructor(int a, int b) // parammetrized constructor
	{
		x = a;
		y = b;

	}
	void sum()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
    // para_constructor p1  = new para_constructor();
    // p1.sum();
		
		para_constructor p2 = new para_constructor(300,400);
		p2.sum();
		
     
     
	}

}
