package ch07_inheritance.sec03_override;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentInt = 1000;
		parent.parentMethod(); // 100
		
		Child child = new Child();
		child.childInt = 300;
		child.parentInt = 600;
		child.parentMethod(); // 600, 300 	Child가 재정의한 메소드 호출
	}

}
