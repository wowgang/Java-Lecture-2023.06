package ch11_api.sec02_system;

public class Ex01_Time {

	public static void main(String[] args) {
		long milliTime = System.currentTimeMillis(); 	// 1970-01-01 00:00:00 기준이후 밀리초
		System.out.println(milliTime);
		
//		long nanoTime = System.nanoTime();
//		System.out.println(nanoTime);
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i=1; i<100000; i++)
			sum += i;
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);  // 100밀리센컨드 1초의 1/10
	}

}
