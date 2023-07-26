package ch06_class;

public class Method {

/*	
 * 메서드: 자주 사용할 코드(기능)를 미리 정의해 둔 것
 * 필요할 때 Call(호출)해서 결과 반환 값을 활용(없을 수도 있음)
 * 
 * 메서드 호출 전달하는 값을 인자(argument)라고 함
 * 메서드에서 인자를 저장하는 변수를 매개변수(parameter)라고 함.
 * 
*/
	// 접근제한자 [지정예약어] 반환자료형 메서드명 (매개변수들) [throws 예외클래스들] {}
	// 반환자료형이 void가 아니라면 return 
	// 결과값이 없다면 void
	// 결과값이 있다면 data type을 써주기
	//	void powerOn() {}
	//	powerOn();
	//	double divide (int x, int y) {}
	//	double result = double(10,20)
	
	public static void callByName() {
		System.out.println("메서드 이름만으로 호출");
	
	}
	
	public static void callByvalue(int n) {
		n = 100;
		System.out.println("callByBalu:");
		System.out.println("값을 전달하면서 호출");
	}
	
//	public static void callByValue(String n) {
//		n = "hello";
	public static void callByValue(int[] n) {
		n[0] = 100;
		System.out.println("참조값을 전달하면서 호출");
		//callByReference라고도 표현함
	}
	
	public static void main(String[] arg) {
		int n =1;
	}
}
