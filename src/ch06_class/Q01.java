package ch06_class;

public class Q01 {

	public static void main(String[] args) {
		// 두 수를 입력 받아 큰 수 출력 메서드 만들기
//		ex) 첫 번째 수: 10
//			두 번째 수: 20
//			10과 2 중 큰수는: 20
		int num1 = 18;
		int num2 = 15 ;
		int result = 0;
		if (num1 < num2 || num1 == num2) {
			result = num2;
			System.out.println(num1 + "과 " + num2 + " 중 큰 수는: " + result);
		} else {
			result = num1;
			System.out.println(num1 + "과 " + num2 + " 중 큰 수는: " + result);
		}

		int result2 = Math.max(num1, num2);
		System.out.println(num1 + "과 " + num2 + " 중 큰 수는: " + result2);
	}

}
