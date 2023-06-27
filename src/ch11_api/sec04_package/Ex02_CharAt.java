package ch11_api.sec04_package;

public class Ex02_CharAt {

	public static void main(String[] args) {
		String s1 = "A quick brown fox";
		String s2 = "자바 프로그래밍";
		System.out.println(s1.charAt(3));	//3번 인덱스 u
		System.out.println(s2.charAt(3));	// 프
		
		String ssn = "010624-4203125";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':	// 7번째 인덱스가 1 또는 3이면 남자이다
		case '3':
			System.out.println("남자"); break;
		case '2':	// 7번째 인덱스가 2 또는 4이면 여자이다
		case '4':
			System.out.println("여자"); break;
			
			
		}
		
	}

}
