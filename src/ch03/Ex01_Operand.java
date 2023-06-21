package ch03;

public class Ex01_Operand {

	public static void main(String[] args) {
		int i = 20;
		System.out.printf("%d, %d\n", i++, ++i);	// 20, 22   +i = 21
		
		// 우선순위 
		// 단항 -> 이항 -> 삼항
		// 산술 -> 비교 -> 논리 -> 대입
		// 우선순위 괄호로 표기하기
		
		int x = -100;
		System.out.println(x);
		
		int sum = 0;
		for (int k = 1; k <= 100; k++) {
			sum += k;
		}
		System.out.println(sum);
		
		System.out.printf("%s, %s\n", 3+3.0+"jdk", "jdk"+3+3.0);	// 6.0jdk, jdk33.0
		
		char capitalA = 'A', capitalB = 'B';
		if (capitalA < capitalB) {
			System.out.println("capitalA 가 capitalB 보다 작다."); // 문자열에서도 순서가 존재 A<B
		}
		
		boolean m = false, n = true; 
		System.out.println(m || n); 	// false or true --> true
		System.out.println(m && n); 	// false and true --> false
		System.out.println(!(m && n)); 	// not (false and true) --> true
		
		int score = 80 + (int) (20 * Math.random());
		char grade = (score >= 90) ? 'A' : 'B'; // 참이면 A 거짓이면 B
		System.out.printf("%d, %c\n", score, grade);
		
//		double value = 2e-350;
		
		boolean stop = false;
		if (stop) {
			System.out.println("멈춤");
		} else {
			System.out.println("출발");
		}
		
		
		
	}

}
