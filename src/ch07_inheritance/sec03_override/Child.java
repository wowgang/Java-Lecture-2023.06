package ch07_inheritance.sec03_override;

/**
* Method override(재정의)
*/
 
public class Child extends Parent{
	int childInt;
	
	void childMethod() {
		System.out.println(this.childInt);
	}
	
	
	@Override // 통상적으로 적어줌  
	// 메소드 재정의 override
	void parentMethod() {
		System.out.print("Parent: ");
		super.parentMethod(); // 부모의 메소드
//		System.out.println(this.parentInt + ", " + this.childInt); // 자식에서 재정의
		System.out.println("Child: " + this.childInt); // 자식에서 재정의
		
	}
}
