package class_object;

class Book {
	String title;
	String author;

Book(String title, String author)
{
	this.title= title;
	this.author=author;
}

void m1(){
	System.out.println("title name of the Book- "+title +" ," + "author name of the book- "+ author);
}
}

public class practice5_E {

	public static void main(String[] args) {
		Book b1 = new Book("hello", "world");
		Book b2 = new Book("space", "Universe");
		Book b3 = new Book("Book", "pen");
		
		b1.m1();
		b2.m1();
		b3.m1(); 

	}

}
