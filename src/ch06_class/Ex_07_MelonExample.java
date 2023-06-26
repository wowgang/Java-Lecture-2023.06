package ch06_class;

public class Ex_07_MelonExample {

	public static void main(String[] args) {
		// 데이터를 데이터 프레임이나,,, 뭔가로 사용하려고 만드는
		// 방법1
		Melon m1 = new Melon(); // 모든변수는 데이터 타임이 있다.
		m1.setRank(1);
		m1.setTitle("퀸카 (Queencard)");
		m1.setArtist("(여자)아이들");
		m1.setAlbum("I feel");
		m1.setImgUrl("https://cdnimg.melon.co.kr/cm2/album/images/112/40/232/11240232_20230509151820_500.jpg/melon/resize/120/quality/80/optimize");
		System.out.println(m1);
		
		// 방법2
		Melon m2 = new Melon(2, "I AM", "IVE (아이브)", "I've IVE", "https://cdnimg.melon.co.kr/cm2/album/images/112/11/297/11211297_20230410151046_500.jpg/melon/resize/120/quality/80/optimize");
		System.out.println(m2);
		
		
		// 방법3
		Melon[] melonCharts = new Melon[2];
		melonCharts[0] = m1;
		melonCharts[1] = m2;
		for (Melon m: melonCharts)
			System.out.println(m);
		
		
		
		
	}

}
