package class_object;

class student {  // create the class
	String name;  // create the variable
	int age;

	void study() {    // create the method
		System.out.println(name + " is studying");
	}

}

public class basic {   // main method

	public static void main(String[] args) {  
		
		student s1 = new student();   // object
		System.out.println(s1.name= "Ankita");   // assign values to variable
		System.out.println(s1.age = 22);
		s1.study();        //calling the method
			
		

	}

}
