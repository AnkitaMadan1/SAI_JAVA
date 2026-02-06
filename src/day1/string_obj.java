package day1;

public class string_obj {

	public static void main(String[] args) {

		String s = "Rahul Shetty Academy";
		String[] arr = s.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("*************");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("************");
		String[] arr1 = s.split("Shetty");
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j].trim());
		}
		String text = "Rahul Shetty Academy";
		String value = text.replace(" ", "");
		System.out.println(value.length());

	}

}
