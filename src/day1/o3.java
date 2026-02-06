package day1;

public class o3 {

	public static void main(String[] args) {
//check poligrone
		String s = "madam";
		String rev = "";

		for (int i = 0; i < s.length(); i++) {
			rev = rev + s.charAt(i);
		}
		System.out.println(s.equals(rev));

	}

}
