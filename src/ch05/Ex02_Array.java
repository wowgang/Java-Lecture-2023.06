package ch05;

import java.util.Arrays;

public class Ex02_Array {

	public static void main(String[] args) {
		// 배열
		int[] score = {80, 70, 78, 92, 96};
		// 길이가 5개인 score라는 배열 생성
		System.out.printf("%d, %d\n", score[0], score[4]);
		// 성적 평균
		int sum = 0;
		for (int i = 0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.printf("합계: %d, 평균: %.1f\n", sum, (double)sum / score.length);
		
		// 배열 생성
		// 생성하면서 값을 지겅하는 경우
		int[] intArray = {4, 67, 8, 91, 23}; //*** 주로 사용됨
		double[] dbArray = {3., 4.6, 2.4};
		String[] fruits = {"사과", "배", "딸기", "수박"};
		
		// 크기를 주고 배열을 생성만 하는 경우 - 이 경우 배열의 값은 초기값으로 지정됨
		int[] newArray = new int[10];	//*** 주로 사용됨
		
		int dice[] = new int[5];
		for (int i=0; i<dice.length; i++) {  // dice.length 속성값.. 어떤것은 메소드로 알아내고
			dice[i] = 1 + (int) (Math.random() * 6);
		}
		System.out.println(Arrays.toString(dice));
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(args.length);
		for (int i = 0; i<args.length; i++ ) {
			System.out.println(args[i]);
			
		}
		String[] myArgs = "10 20 30".split(" ");
		System.out.println(Arrays.toString(myArgs));
		
	}

}
