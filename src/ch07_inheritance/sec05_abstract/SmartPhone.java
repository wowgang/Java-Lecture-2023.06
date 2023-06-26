package ch07_inheritance.sec05_abstract;

public class SmartPhone extends Phone {

	// 스마트폰이 폰을 상속받음
	@Override
	void turnOn() {
		System.out.println("스마트폰 전원을 켭니다.");
	}
	@Override
	void turnOff() {
		System.out.println("스마트폰 전원을 끕니다.");
	}
	
	@Override
	public void call(String number) {
		System.out.println(number + "로 전화를 겁니다.");
	}

}
