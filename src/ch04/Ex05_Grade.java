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
				
		int score;
		System.out.print("점수를 입력하세요: ");
		score = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		char grade;
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else
			grade = 'D';
		System.out.println(score + "점은 " + grade + " 학점입니다.");
		
		
		char grade2;
		if (score % 10 >= 7)
			grade2 = '+'; 
		else if(score % 10 >= 3)
			grade2 = '0'; 
		else 
			grade2 = '-'; 
		
			
		
		System.out.println(score + "점은 " + grade + grade2 + " 학점입니다.");
				
	}
}
