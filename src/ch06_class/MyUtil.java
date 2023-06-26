package ch06_class;

public class MyUtil {
//	public MyUtil() { } // Java가 알아서 만들어 줌 , 생략가능
	
	public int getMinimum(int[] array) { // 인스턴스 메소드 객체o
		int min = Integer.MAX_VALUE; // int 변수가 가질 수 있는 최대 양수 값/오버플로우가 발생시 값이 부호 반대쪽으로 감소or최소값
		for (int element: array) {
			if (min > element)
				min = element;
		}
		return min;
	}
	public int getMaximum(int[] array) {
		int max = Integer.MIN_VALUE; // int 변수가 가질 수 있는 가장 작은 음수 값/오버플로우가 발생시 값이 부호 반대쪽으로 증가or최대값
		for (int element: array) {
			if (max < element)
				max = element;
		}
		return max;
	}
	
	public static double getAverage(int[] array) { // 스테틱 메소드 객체x
		int sum = 0;
		for (int element: array) 
			sum += element;
		return (double) sum / array.length;
	}
	
	private void privateMethod() {
		
	}
	
}
