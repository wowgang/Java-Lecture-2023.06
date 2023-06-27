package ch10_exception;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		// str = "Java";
		// System.out.println(str.length());  // NullPointerException
		
		if (str != null)  // dead 코드 절대로 실행이될수없는코드지만.. 예시로
			System.out.println(str.length());
	}

}
