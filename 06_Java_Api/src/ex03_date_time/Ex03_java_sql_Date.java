package ex03_date_time;

import java.sql.Date;

public class Ex03_java_sql_Date {

	public static void main(String[] args) {
		
		Date now = new Date(System.currentTimeMillis());
		System.out.println(now);

	}

}
