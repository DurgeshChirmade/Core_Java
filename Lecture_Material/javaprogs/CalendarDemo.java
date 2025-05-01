package apps;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		int hour = cal.get(Calendar.HOUR);

	}

}
