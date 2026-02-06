package learning_Phase;

public class class_variable {

	String name; // class variable
	int rollno;
	int id;

	void output() { // print the data
		System.out.println(name + " " + rollno + " " + id);
	}
                 // local variable
	void output1(String na, int roll, int i) { // store the data
		name = na;
		rollno = roll;
		id = i;
	}
	class_variable(String na, int roll, int i)// constructor
	{
		name = na;
		rollno = roll;
		id = i;
	}

}
