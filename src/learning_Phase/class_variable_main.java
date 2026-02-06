package learning_Phase;

public class class_variable_main {

	public static void main(String[] args) {

		/*class_variable v1 = new class_variable();
		{
        // using object reference variable
			v1.id = 21;
			v1.name = "Ankita";
			v1.rollno = 23;
			
			v1.output();
			
			
			//using method
			v1.output1("Ankita", 34, 2);
			v1.output();
			
			

		}
*/
		// using constructor
		class_variable v1 = new class_variable("Ankita",23,45);
		v1.output();
	}

}
