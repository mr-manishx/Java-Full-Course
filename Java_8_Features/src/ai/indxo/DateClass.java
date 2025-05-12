package ai.indxo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Date now = new Date();
		System.out.println("Current date and time: " + now);

		// get time in millisecond

		System.out.println("Time in millisecond: " + now.getTime());

		// Creating date
		@SuppressWarnings("deprecation")
		Date d1 = new Date(2000, 11, 21);
		Date d2 = new Date(); // Current date
		@SuppressWarnings("deprecation")
		Date d3 = new Date(2010, 1, 3);

		boolean a = d3.after(d1);
		System.out.println("Date d3 comes after " + "date d2: " + a);

		boolean b = d3.before(d2);
		System.out.println("Date d3 comes before " + "date d2: " + b);

		int c = d1.compareTo(d2);
		System.out.println(c);

		System.out.println("Miliseconds from Jan 1 " + "1970 to date d1 is " + d1.getTime());

		System.out.println("Before setting " + d2);
		d2.setTime(204587433443L);
		System.out.println("After setting " + d2);

		// Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(now);
		System.out.println(format1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(now);
		System.out.println(format2);

		// Convert String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20");
		System.out.println(parsedDate);

	}

}
