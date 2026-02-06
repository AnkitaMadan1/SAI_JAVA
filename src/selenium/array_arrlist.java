package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_arrlist {

	public static void main(String[] args) {

		String[] s = { "selenium", "java", "cucumber" };

		List<String> text = new ArrayList<>(Arrays.asList(s));
		/*
		 * for(int i =0;i<text.size(); i++) { System.out.println(text.get(i)); }
		 */
		// System.out.println(text);
		System.out.println(text.contains("selenium"));
		text.add("testng");
		/*for (int i = 0; i < text.size(); i++) {
			System.out.println(text.get(i));*/
			text.remove(0);
			for (int i = 0; i < text.size(); i++) {
				System.out.println(text.get(i));
		}

	}

}
