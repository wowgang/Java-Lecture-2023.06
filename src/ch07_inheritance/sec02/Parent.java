package ch07_inheritance.sec02;

public class Parent {
	int parentInt; // 정수는 0으로 초기화
	
	
	Parent() {}
	Parent(int parentInt) {
		this.parentInt = parentInt;
		
	}
	
	void parentMethod() {
		System.out.println(this.parentInt);
	}
}
