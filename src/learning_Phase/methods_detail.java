package learning_Phase;

public class methods_detail {
	
	// No params no return value
	
	void m1()
	{
		System.out.println("Hello.....");
	}
	
	// No params but return value
	
	String m2()
	{
		return("Hello How are you");
	}
	// Take params no return value
	
	void m3(String name)
	{
		System.out.println("Hello " + name);
	}
    // Take params, return value
	
	String m4(int rollno, int age , String name)
	{
		return(rollno +"  "  +age + " " +name);
	}
	
}
