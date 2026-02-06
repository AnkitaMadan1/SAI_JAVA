package learning_Phase;



class parent{
	void print(int a)
	{
		System.out.println(a);
	}
}
class child1 extends parent{
	void display(int b) {
		System.out.println(b);
	}
}
	
	class child2 extends parent{
		void display(int c) {
			System.out.println(c);
		}
	}


public class heirarchy {

	public static void main(String[] args) {
		child1 ch = new child1(); {
			ch.display(20);
			ch.print(1234);
			
		}
		
			
		

	}
}
