package ch11_api.sec04_package;

public class Ex09_Trim {

	public static void main(String[] args) {
		// trim() 화이트 스페이스 제거
		String oldStr = "\t  자바 프로그래밍  \t \r\n";
		String newStr = oldStr.trim();
		
		System.out.println(newStr.length());	// 8
		System.out.println(newStr);	// 자바 프로그래밍
		
				
		
		
	}

}
