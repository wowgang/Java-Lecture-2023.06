package ch04;

/**
* 50 <= score <= 99
*score >= 90 A 
*score >= 80 B 
*score >= 70 C 
*score >= 60 D
*97 >= 7 +
*93 >= 3 0
*90 >= 0 -
* 
*/

import java.util.Scanner;

public class Ex05_Grade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();  // nextInt 
//		int score = Integer.parseInt(scan.nextLine());
		scan.close();
		
		String grade;
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else
			grade = "D";
		System.out.println(score + "점은 " + grade + " 학점입니다.");
		
		
		String grade2;
		if (score % 10 >= 7)
			grade2 = "+"; 
		else if(score % 10 >= 3)
			grade2 = "0"; 
		else 
			grade2 = "-"; 
		
		switch(score /10) { 
		case 10: 
			grade = "A+"; break;
		case 9:
			grade = "A" + grade2; break;
		case 8:
			grade = "B" + grade2; break;
		case 7:
			grade = "C" + grade2; break;
		case 6:
			grade = "D" + grade2; break;
		}
		
		System.out.println(score + "점은 " + grade + " 학점입니다.");
				
	}
}
