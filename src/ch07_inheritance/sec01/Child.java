package ch07_inheritance.sec01;

public class Child extends Parent{
	// Parent 상속받음 extends
	int childInt;
	
	Child() {}
	
	Child(int childInt) {
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
