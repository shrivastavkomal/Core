package Date;

import java.util.Calendar;

public class Add_date_calender {
	public static void main(String[] args) {
	
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <=12; i++) {
			cal.add(Calendar.DATE,30);
			System.out.println(cal.getTime());
			
		}
	}

	
}
