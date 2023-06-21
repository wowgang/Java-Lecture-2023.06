package ch04;

import java.util.Scanner;

/**
* 윤년 (Leap Year) 구하는 프로그램
* 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
* 윤년 400 배수
* 평년 100
* 4 윤년
* X 평년
*/
public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.println("연도 입력>");
		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		
		String result;
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 100 == 0)
			result = "평년";
		else if (year % 4 == 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		
		
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		
	
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		
		System.out.println(year + "년은 " + leapYear(year) + "입니다.");
		
	}
	
	// 윤년 매서드 만들기 private, public 둘다 가능하나 static은 고정
//	public static String leapYear(int year) {
	private static String leapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
			return "윤년";
		return "평년";
	}
	
	

    

}
