package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date_ {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		for (int i = 1; i <= 12; i++) {
			cal.add(Calendar.DATE,30);
			String s = sdf.format(d);
			
		}
	}
}
