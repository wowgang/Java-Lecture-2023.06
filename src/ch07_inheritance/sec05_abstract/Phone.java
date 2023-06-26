package ch07_inheritance.sec05_abstract;

/**
 * Phone을 추상화한 클래스
 */

public abstract class Phone {
	// 추상클래스 abstract
	// 클래스들의 공통되는 필드와 메소드를 정의한 클래스를 말함
	
	public String owner;
	public String number;
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 클래스를 상속 받은 클래스는 추상 메소드를 반드시 재정의해야 함.
	public abstract void call(String number); // 인터페이스 interface
	
	
	
	
}
