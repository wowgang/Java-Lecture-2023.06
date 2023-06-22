package ch05;

import java.time.LocalDate;

public class Ex07_Enum {
	public enum Week {MON, TUE, WED, THU, FRI, SAT, SUN}; // 열거 상수 선언
	
	public static void main(String[] args) {
		// 열거타입: 몇 가지로 한정된 값을 가지는 타입 (거의사용하지않음)
		
		Week date = Week.THU;
		System.out.println(date.name()); 	// THU
		System.out.println(date.ordinal()); // 3
		
		LocalDate today = LocalDate.now();
		System.out.println(today);	// 2023-06-22
		System.out.println(today.getDayOfWeek());	// THURSDAY 열거타입
		
		
		
		

	}

}
