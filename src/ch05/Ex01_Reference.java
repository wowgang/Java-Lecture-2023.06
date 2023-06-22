package ch05;

import java.util.Scanner;

public class Ex01_Reference {

	public static void main(String[] args) {
		// 참조형 변수
		int a = 10, b = 10;
		System.out.println(a == b);
		
		String ref1 = "자바";
		String ref2 = "자바";
		System.out.println(ref1 == ref2); // ref1과 ref2의 주소를 물어보는것 값이아니라 
		// String의 내용이 같은지 물어보는것이아니고, 
		// 참조하는 기억장소가 같은지를 물어보는 것.
		
		String ref3 = new String("자바"); // 새로운 literal 객체 생성 
		System.out.println(ref3);
		System.out.println(ref1 == ref3 ); // false 주소가 다름
		System.out.println(ref1.equals(ref3)); // true 값 비교
		
		// 참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있음.
		String s = null; 
		String[] strArrStrings = null;
		Scanner scan = null;
		System.out.println( s == null);
		System.out.println( strArrStrings == null);
		System.out.println( scan == null);
		
		String t = "";
		System.out.println(t.length());	// 0
//		System.out.println(s.length()); // NullPointerException 에러 null의 길이는 에러남
		
	}

}
