package ch11_api.sec07_date;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 월은 숫자 하나 적게 나와서 +1해주기
		int day = now.get(Calendar.DAY_OF_MONTH);
		int date = now.get(Calendar.DAY_OF_WEEK); // 요일 (수요일 - 4) 일요일 - 1
		int amPm = now.get(Calendar.AM_PM); // 오후1
		int hour = now.get(Calendar.HOUR);	// 2시
		int hour24 = now.get(Calendar.HOUR_OF_DAY);	// 14시
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d\n", 
				year, month, day, date, amPm, hour, hour24, minute, second);
	}

}
