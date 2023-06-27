package ch11_api.sec01_object;

public class Ex01_Equals {
	public static void main(String[] args) {
		Member m1 = new Member("james", "제임스");
		Member m2 = new Member("james", "제임수");
		Member m3 = new Member("james", "제임스");
//		Member m4 = new Member("james", "James");
		
		
		// Member에서 equals method를 재정의하기 이전이면 참조하는 주소를 갖고 비교하기 때문에 false
		System.out.println(m1.equals(m2)); 	// false
		System.out.println(m1.equals(m3));	// false  equals method를 재정의하기 이전
		
		Member2 nm1 = new Member2("james", "제임스");
		Member2 nm2 = new Member2("james", "제임수");
		Member2 nm3 = new Member2("james", "제임스");
		
		// Member2에서 equals method를 재정의 - id와 name이 같으면 동일
		System.out.println(nm1.equals(nm2));	// false
		System.out.println(nm1.equals(nm3));	// true

	}
}
