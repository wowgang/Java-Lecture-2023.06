package ch10_exception;

// Ex07_MultiCatch2 파일보다 더 간결하게

public class Ex07_MultiCatch2 {

	public static void main(String[] args) {
		String str = null;
		int value = 0;
		
		try {
			str = args[0]; 
			value = Integer.parseInt(str);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			e.printStackTrace(); // 예외의 스택 트레이스(stack trace)를 출력하는 메서드
//			System.out.println("사용법: 매개변수를 입력하세요. Run -> Configuration -> Argument");
			System.out.println("매개변수가 없거나 잘못된 숫자 형식입니다.");
		} 
		System.out.println(value);
	}
}
