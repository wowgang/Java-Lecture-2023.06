package ch07_inheritance.sec02;

/**
* 부모생성자 호출
*/


public class Child extends Parent{
	// Parent 상속받음 extends
	int childInt;
	
	Child() {}
	Child(int childInt) {
		super(childInt * 2); // 부모 생성자 호출 / 제일 첫줄에서 부모 생성자 호출하기/ 명시적으로 부모호출
		this.childInt = childInt;
	}
	

	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
