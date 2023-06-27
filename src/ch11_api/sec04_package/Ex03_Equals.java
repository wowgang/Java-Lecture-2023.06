package ch11_api.sec04_package;

public class Ex03_Equals {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		
		
		// 참조하는 객체의 주소가 같은지를 비교하는 메서드
		System.out.println(s1 == s2);	// true		// 홍길동 String의 리터럴이 있음
		System.out.println(s1 == s3);	// false
		System.out.println(s2 == s3);	// false
		
		System.out.println("======");
		
		// String은 문자열이 같은지를 비교해야 함
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s3));	// true
	}

}
