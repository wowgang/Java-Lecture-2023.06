package ch11_api.sec06_math;

public class Ex01_Math {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.printf("%d, %.2f\n", v1, v2);
		
		// ceil 앞에 있는게 나온다..
		double v3 = Math.ceil(5.3);		// 6.0
		double v4 = Math.ceil(-5.3);	// -5.0
		System.out.printf("%.1f, %.1f\n", v3, v4);
		
		
		double v5 = Math.floor(5.3);		// 5.0
		double v6 = Math.floor(-5.3);		// -6.0
		System.out.printf("%.1f, %.1f\n", v5, v6);
		
		System.out.println(Math.random());
//		int(Math.random()*6)+1
//		0 <= ~ <6 까지라 +1을 해주면 0<= ~ <=6 
		// 정수 1 ~ 6 까지 난수
		System.out.println((int)(Math.random() *6)+1);
		
		System.out.println(Math.round(Math.PI));	// 3L
		System.out.printf("%.10f", Math.PI);
		
		
	}

}
