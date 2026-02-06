package day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat d1 = new SimpleDateFormat("M/dd/YYYY");
		System.out.println(d1.format(d));

		SimpleDateFormat d2 = new SimpleDateFormat("M/dd/YYYY   hh:mm:ss");
		System.out.println(d2.format(d));

	}

}
