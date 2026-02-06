package learning_Phase;

import java.util.Scanner;

public class Handling_exemption {

	public static void main(String[] args) {
		// case 1: Exception occured, catch block handled ---> finally block will execute
		// case 2: Exception occured, catch block not handled ---> finally block will execute
		// case 3: Exception does not occured, catch block ignored ---> finally block will execute
		System.out.println("Program is started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		try {
			System.out.println(100 / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input");
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Invalid input"); // this is matching one but if dont know you can multiple catch
			System.out.println(e.getMessage()); // why exemption occured (method)
		}
		catch(Exception e){
			System.out.println("Invalid input");
			System.out.println(e.getMessage()); 
		}
			finally
			{
				System.out.println("we are out of exemption");
				
			}
		// finaly block can be written once but catch block can be written multiple times
			
		

		System.out.println("Program is calculated");
		System.out.println("Program is executed");

	}

}
