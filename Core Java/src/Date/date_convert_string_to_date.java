package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_convert_string_to_date {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String s = "04/03/2023";
		Date d = sdf.parse(s);
		System.out.println(d);
		
		
	}

}
