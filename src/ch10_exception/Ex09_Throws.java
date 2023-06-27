package ch10_exception;
//throws: 메소드 선언부 끝에 작성되어 메소드에서 처리하지않은 예외를 호출한 곳으로 떠넘기는 역할
//개발코드 -> throws -> 서비스코드
public class Ex09_Throws {

	public static void main(String[] args) throws Exception {
		findClass();
	}
	
	static void findClass() throws ClassNotFoundException {
//		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz.getName());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
	}
	
}
