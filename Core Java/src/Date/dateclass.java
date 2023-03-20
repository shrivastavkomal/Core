package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateclass {

	public static void main(String[] args) {
		
		Date T = new Date();
		
		System.out.println(T);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(T);
		System.out.println(s);
	}
}
