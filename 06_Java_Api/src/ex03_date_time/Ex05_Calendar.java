package ex03_date_time;

import java.util.Calendar;
import java.util.Date;

//mport org.graalvm.compiler.core.common.FieldsScanner.CalcOffset;

public class Ex05_Calendar {
	
	


	public static void main(String[] args) {
		//Calendar
		//현재 날짜
		Calendar now = Calendar.getInstance();
		
		//년,월,일, 요일 가져오기 
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int weekNo = now.get(Calendar.DAY_OF_WEEK); //일(1),월(2)...
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		String[] week = {"일","월","화","수","목","금","토"};
		System.out.println(week[weekNo -1]+ "요일");
		
		int ampm = now.get(Calendar.AM_PM);
		int hour12 = now.get(Calendar.HOUR);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int secone = now.get(Calendar.SECOND);
		
		System.out.println(ampm);
		System.out.println(hour12);
		System.out.println(hour24);
		System.out.println(minute);
		System.out.println(secone);
		
		//날짜 시간 변경시 사용
		now.add(Calendar.DATE,1);
		//now.add(Calendar.HOUR, -3);
		//System.out.println(now.get(Calendar.HOUR));
		
		
		
		
	}

}
