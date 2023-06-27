package ch10_exception;

public class Ex03_NumberFormat {

	public static void main(String[] args) {
		String str1 = "100";
		String str2 = "100원";
		int value1 = Integer.parseInt(str1); // 문자열을 숫자로 변환
		int value2 = Integer.parseInt(str2);
		System.out.println(value1); // "100" 문자열은 숫자로 변환이 가능
		System.out.println(value2); // NumberFormat "100원" 문자열은 숫자로 변환할 수 없기 때문에 
		
		
		// 문자열 API 또는 정규 표현식을 사용하여 숫자 이외의 문자는 다 삭제
		String str3 = str2.replace("원", "");
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); 
		
	}

}
