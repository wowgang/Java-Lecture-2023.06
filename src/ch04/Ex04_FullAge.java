package ch04;

// 만나이
import java.time.LocalDate;
import java.util.Scanner;


public class Ex04_FullAge {

	public static void main(String[] args) {
		String[] birth = "1994-06-24".split("-");
		int year = Integer.parseInt(birth[0]);
		int month = Integer.parseInt(birth[1]);
		int day = Integer.parseInt(birth[2]);
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		// 오늘 날짜 구하는방법
		LocalDate today = LocalDate.now();
		System.out.printf("%d-%02d-%02d\n",today.getYear(),today.getMonthValue(),today.getDayOfMonth());
		
		
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.print("생년월일을 입력하세요: ");
		age = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		if (today.getMonthValue() < month) {
			age = today.getYear() - year -1;
		} else if (today.getMonthValue() > month) {
			age = today.getYear() - year;
		} else {
			if (today.getDayOfMonth() < day) {
				age = today.getYear() - year -1;
			} else {
				age = today.getYear() - year;
			}
		}
		System.out.println("만" + age + " 입니다." );


		
		
		
	   }
	}


