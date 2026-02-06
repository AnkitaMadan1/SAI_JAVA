package day1;

public class o7 {

	public static void main(String[] args) {
		String s = "AbC123@#";

		int upper=0, lower=0, digit=0, special=0;

		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);

		    if (c >= 'A' && c <= 'Z') upper++;
		    else if (c >= 'a' && c <= 'z') lower++;
		    else if (c >= '0' && c <= '9') digit++;
		    else special++;
		}

		System.out.println(upper+" "+lower+" "+digit+" "+special);

	}

}
