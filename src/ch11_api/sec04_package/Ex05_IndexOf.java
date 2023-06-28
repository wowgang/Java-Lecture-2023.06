package ch11_api.sec04_package;

// indexOf 글자가 시작하는 위치 알려줌 
// 찾고자 하는 문자가 있는지도 확인 가능

public class Ex05_IndexOf {

	public static void main(String[] args) {
		String str = "자바 프로그램";
		
		int index = str.indexOf("자바");
		System.out.println(index);	// 0 자바 글자가 시작하는 위치
		index = str.indexOf("프로그램");
		System.out.println(index);	// 3
		
		// 찾고자 하는 문자열이 대상 문자열에 있는 경우 리턴 값이 0 이상임.
		System.out.println(str.indexOf("자바") >= 0);	// true 찾고자 하는 글자가 있음
		System.out.println(str.indexOf("자비") >= 0);	// false 찾고자 하는 글자가 없음
		
		System.out.println(str.contains("프로그램"));	// true	찾고자 하는 글자가 있음 (최근에 생김)
		
		
	}

}
