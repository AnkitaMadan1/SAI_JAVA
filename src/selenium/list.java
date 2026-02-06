package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {

	public static void main(String[] args) {

		int[] arr = { 34, 23, 56, 78, 65 }; // static
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ankita");
		a.add("Harry");
		a.add("Poter");
		a.add("Madan");

		// System.out.println(a.get(3));
		for (String val : a) {
			System.out.println(val);
		}
		System.out.println("*****");
		a.remove(1);
		for (String val1 : a) {
			System.out.println(val1);
		}
	  String[]text = {"erase", "sharpner", "notebook"};
		System.out.println(a.contains("Harry"));
		 List<String> value = Arrays.asList(text);
		 System.out.println(value.contains("sharpner"));

	}

}
