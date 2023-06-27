package ch10_exception;

public class Ex06_TryCatch {

	public static void main(String[] args) {
		String str = null;
		try {
			str = args[0]; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("사용법: 매개변수를 입력하세요.");
			e.printStackTrace(); // 예외의 스택 트레이스(stack trace)를 출력하는 메서드
		}
		System.out.println(str); // Run -> Configuration -> Argument -> 문자 입력하면 에러사라짐
		
		int value = 0;
		try {
			value = Integer.parseInt(str);	// Run -> Configuration -> Argument -> 10000 숫자 입력하면 에러사라짐
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된 숫자형식 입니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println(value);
	}

}
