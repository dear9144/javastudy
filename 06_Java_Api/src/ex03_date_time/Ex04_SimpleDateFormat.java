package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat {

	public static void main(String[] args) {
	
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h : mm: ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);

	}

}
