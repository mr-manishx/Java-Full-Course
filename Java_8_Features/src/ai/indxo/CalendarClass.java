package ai.indxo;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		System.out.println("The Current Date is:" + c.getTime());

		System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
		System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
		System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + c.get(Calendar.SECOND));

		int max = c.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in a week: " + max);

		max = c.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in a year: " + max);

		int min = c.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days in week: " + min);

		min = c.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in year: " + min);

		c.add(Calendar.DATE, -15);
		System.out.println("15 days ago: " + c.getTime());
		c.add(Calendar.MONTH, 4);
		System.out.println("4 months later: " + c.getTime());
		c.add(Calendar.YEAR, 2);
		System.out.println("2 years later: " + c.getTime());

		// Displaying the Current Date
		System.out.println("Current Date&Time: " + c.getTime());

		// Clear method for undefining the values of the calendar
		c.clear();

		// Displaying the final result
		System.out.println("After clear method: " + c.getTime());

		// Displaying the month
		System.out.println("The Current Month is: " + c.get(Calendar.MONTH));

		// Replacing with a new value
		c.set(Calendar.MONTH, 11);

		// Displaying the modified result
		System.out.println("Altered Month is: " + c.get(Calendar.MONTH));
	}

}
