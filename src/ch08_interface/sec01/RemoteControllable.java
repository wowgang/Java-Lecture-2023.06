package ch08_interface.sec01;
//new -> interface
// 보통 동작의 개념으로 able로 짓는다.
public interface RemoteControllable {
	// 상수 (Constant)  //정적필드선언불가
	public int MAX_VOLUME = 10;		// static final 이 생략되어 있음
	public static final int MIN_VOLUME = 0; 
	
	// 추상 메소드(Abstract method)
	void turnOn();		// public abstract 가 생략되어 있음
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// 인터페이스는 구현한 클래스를 만들어라
	
}
