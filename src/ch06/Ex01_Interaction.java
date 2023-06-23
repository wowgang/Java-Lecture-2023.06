package ch06;

public class Ex01_Interaction {

	public static void main(String[] args) {
		int[] scores = {67, 89, 87, 92, 72};
		MyUtil myUtil = new MyUtil();	// 객체 생성
		int min = myUtil.getMinimum(scores); 	// 인스턴스 메소드 호출
		int max = myUtil.getMaximum(scores);	
		double average = MyUtil.getAverage(scores); // 정적 메소드 호출 static 객체를 만들지 않고 바로 사용가능 .붙이고 / 이텔릭글자는 staric임을 알수있다
		System.out.printf("%d, %d, %.1f\n", min, max, average);
		// 클래스이름은 대문자로 시작
		// public 접근제한자 
		
//		myUtil.privateMethod();		// 접근 제한자가 private이라서 외부에서 사용 불가
		
	}

}
