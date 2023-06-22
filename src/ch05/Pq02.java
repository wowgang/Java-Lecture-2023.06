package ch05;

import java.util.Scanner;

public class Pq02 {

	public static void main(String[] args) {
		// 연습문제 p200-201 4,5,6
		// Q4. 배열에서 최대값 구하기
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for (int arr: array) {
			if (arr > max) {
				max = arr;
			}
		}
		System.out.println("max: " + max);
		
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
		
		// Q5. 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i=0; i<array2.length; i++) {
			for (int j=0; j<array2[i].length; j++) {
				sum += array2[i][j];
			}
		}
		avg =  sum / (double) array2.length;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
//		// 간결하게 바꾸는거 되나
		int[][] array0 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				
		};
		
		int sum0 = 0;
		double avg0 = 0.0;
		
		for (int i=0; i<array0.length; i++) {
			for (int j=0; j<array0[i].length; j++) {
				sum0 += array0[i][j];
			}
		}
		avg0 =  sum0 / (double) array0.length;
		System.out.println("sum: " + sum0);
		System.out.println("avg: " + avg0);
		
		
		// Q6. 학생수와 각 학생들의 점수를 입력 받아서 최고 점수 및 평균 점수를 구하는 
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
//			Scanner scan = new Scanner(System.in);
//			String text = "";
//			for (int i=0; i<5; i++) {
//				System.out.print("입력> ");
//				String line = scan.nextLine();
//				text += line + " ";
			
			
			Scanner scan = new Scanner(System.in);
			int inputdata = 0;
			if (selectNo == 1) {
				System.out.println("학생수 입력> ");
				int students = scan.nextInt();  
			} else if (selectNo == 2) {
				System.out.println("점수 입력> ");
//				int[] scores = scan.nextInt();
			} else if (selectNo == 3) {
				System.out.println("점수 리스트> ");
				
			} else if (selectNo == 4) {
				System.out.println("분석 > ");
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	} // public static

}
