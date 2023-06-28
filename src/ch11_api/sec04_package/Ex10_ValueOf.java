package ch11_api.sec04_package;

public class Ex10_ValueOf {

	public static void main(String[] args) {
		String num = String.valueOf(100);
		String num2 = "" + 100;	// 이렇게 써도 위와 동일함
		System.out.println(num.equals(num2));// true
		
	}

}
