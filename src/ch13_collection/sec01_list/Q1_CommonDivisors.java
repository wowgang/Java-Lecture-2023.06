package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *  두 개의 정수를 입력으로 받아서, 두 수의 공약수를 찾으세요
 *  단, 두 수의 공약수를 리스트로 반환하는 메소드 getCommonDivisors()를 만들어 해결하세요.
 */

public class Q1_CommonDivisors {

	public static void main(String[] args) {
		//1
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수 2개 입력> ");
		String[] nums = scan.nextLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		
		//3
		List<Integer> list = getCommonDivisors(a, b);
		for (int i: list)
			System.out.println(i);	// 1,2,3,4,6,12
	}
	//2
	private static List<Integer> getCommonDivisors(int a, int b) {
		List<Integer> list = new ArrayList<>(); 	// 빈 리스트 만들기
		for (int i=1; i<=Math.min(a, b); i++)
			if (a % i == 0 && b%i==0)
				list.add(i);
		return list;
	} // 쌤코드 여기까지
		
		
//		int num1 = 24;
//		int num2 = 60;
//		
//		List<Integer> getCommonDivisors2 = new ArrayList<>();
//		for (int i=1; i<=((num1>num2) ? num2 : num1); i++) {
//			if (num1 % i ==0 && num2 % i == 0) {
//				getCommonDivisors2.add(i);
//			}
//		}
//		System.out.println("공약수: " + getCommonDivisors2);	// 공약수: [1, 2, 3, 4, 6, 12]
		
		
	
//	}	// 쌤코드 안할때 여기까지 주석 풀어주기
	
	
}
