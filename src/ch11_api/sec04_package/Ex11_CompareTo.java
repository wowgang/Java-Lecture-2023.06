package ch11_api.sec04_package;

/**
 * compareTo(): 사전순으로 나열 했을 때 , 두 객체의 비교 (음수, 0, 양수) 
 * 숫자값은 보지말고 부호만 봐라
 */


public class Ex11_CompareTo {

	public static void main(String[] args) {
//		String s1 = "Apple", s2 = "Banana", s3 = "Cherry";
		String s1 = "Apple", s2 = "Banana";
		String s3 = new String("Apple");
		
		// s1이랑 s2를 비교했을 때 apple이 banana보다 더 크다.
		System.out.println(s1.compareTo(s2));	// -1	A-A
		System.out.println(s2.compareTo(s1));	// 1	B-A
		System.out.println(s1.compareTo(s3));	// 0	A-A
		
		
//		나 - 다 
//		사전순으로 나 가 먼저이니까 음수가나옴
//		가 - 나 
//		사전순으로 가 가 먼저이니까 양수가 나옴
//		같은 글자면 제로 0
		
		
//		compareTo() 메서드는 일반적으로 숫자나 문자열의 비교에 주로 사용됩니다. 
//		예를 들어, 정수형의 경우 숫자의 대소 관계를 비교하고, 문자열의 경우 사전식 순서를 비교
		
//		호출하는 객체가 other보다 작을 경우, 음수 값을 반환합니다. (보통 -1)
//		호출하는 객체가 other와 같을 경우, 0을 반환합니다.
//		호출하는 객체가 other보다 클 경우, 양수 값을 반환합니다. (보통 1)
		
		// 숫자 비교
		Integer numm1 = 10;
		Integer numm2 = 5;
		int result = numm1.compareTo(numm2);
		// num1이 num2보다 크므로 result는 양수 값(1)을 반환

		// 문자열 비교
		String strr1 = "apple";
		String strr2 = "banana";
		int resultt = strr1.compareTo(strr2);
		// str1이 str2보다 작으므로 result는 음수 값(-1)을 반환

		
		
		Student st1 = new Student(1, "James");	//-3 J-N
		Student st2 = new Student(2, "Maria");	//8 J-B
		Student st3 = new Student(3, "Brian");
		System.out.println(st1.compareTo(st2));
		System.out.println(st1.compareTo(st3));
		
	}

}
