package ch05;

import java.util.Arrays;

public class Ex03_MultiDemension {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] matrix = new int[2][3];
		int score[][] = {{80, 90, 85}, {92, 76, 84}};
		
		System.out.printf("%d, %d\n", score[0][0], score[1][2]); 	// 80, 84
		
		// 행의 갯수, 열의 갯수
		System.out.printf("%d, %d\n", matrix.length, matrix[0].length); // 2,3
		
		// toString은 1차원 배열만 출력가능
		System.out.println(Arrays.toString(score)); // 에러 출력안됨 다차원이라 
		System.out.println(Arrays.toString(score[0])); //  [80, 90, 85]
		System.out.println(Arrays.toString(score[1])); //  [92, 76, 84]
		

	}

}
