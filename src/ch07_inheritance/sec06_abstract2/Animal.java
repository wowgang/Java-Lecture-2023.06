package ch07_inheritance.sec06_abstract2;

public abstract class Animal {
	// Animal은 직접 자신을 객체로 만들지는 못함
	String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
}
