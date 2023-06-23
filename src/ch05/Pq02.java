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
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
						
			
			if (selectNo == 1) {
				System.out.print("학생수 입력> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i=0; i <scores.length; i++) {
				System.out.print("scores[" + i + "]> ");
				scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i=0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]> : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max2 = 0;
				int sum2 = 0;
				double avg2 = 0;
				for (int i = 0; i <scores.length; i++) {
					max2 = (max2 < scores[i]) ? scores[i] : max2;
					sum2 += scores[i];
				}
				avg2 = (double) sum2 / studentNum;
				System.out.println("최고 점수 : " + max2);
				System.out.println("평균 점수 : " + avg2);
			} else if (selectNo == 5) {
				run = false;
				}
		}// while
		System.out.println("프로그램종료");
		
	} // public static

}
