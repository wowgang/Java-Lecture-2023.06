package ch04;

// 만나이
import java.time.LocalDate;
import java.util.Scanner;


public class Ex04_FullAge {

	public static void main(String[] args) {
		String[] birth = "1994-06-24".split("-");	// String array
		int year = Integer.parseInt(birth[0]);
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		// 오늘 날짜 구하는방법
		LocalDate today = LocalDate.now();
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		System.out.printf("%d-%02d-%02d\n",tYear,tMonth,tDay);
		
		
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.print("생년월일을 입력하세요: ");
		age = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		if (tMonth < month) {
			age = tYear - year -1;
		} else if (tMonth > month) {
			age = tYear - year;
		} else {
			if (tDay < day) {
				age = tYear - year -1;
			} else {
				age = tYear - year;
			}
		}
		System.out.println("만" + age + " 입니다." );


		
		
		
	   }
	}


