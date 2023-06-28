package ch11_api.sec07_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex02_LocalDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);	// 2023-06-28
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);	// 2023-06-28T12:39:39.934362200 나노 초 까지 붙음
		
//		now는 객체임 그래서 String을 바로 사용할 수 없어서
//		toString을 해준다음 substring가능
		System.out.println(now.toString().substring(0,19).replace("T", " "));
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);	// 12:42:51.134496500
		System.out.println(currTime.toString().substring(0,8));	// 12:43:31	
		
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		
		DayOfWeek date = today.getDayOfWeek();
		System.out.println(date);	// WEDNESDAY
		System.out.println(date.getValue());	// 3
		String[] dates = "일,월,화,수,목,금,토".split(",");
		System.out.println(dates[date.getValue()] + "요일");	// 수요일
		
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
		
		
				
		
		
	}

}
