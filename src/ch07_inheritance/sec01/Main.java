package ch07_inheritance.sec01;

public class Main {

	public static void main(String[] args) {
		// 
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.parentInt = 1000;
		parent.parentMethod();
		
		child.childInt = 300;
		child.childMethod();
		
		// child가 상속받은 parent의 속성/메소드 이용
		child.parentInt = 2000;
		child.parentMethod(); // 2000
		
		// child가 상속받은 Parent instance와 parent instance는 다른 객체임.
		parent.parentMethod(); // 1000 
		// parent의 객체가 따로있고 child.parent객체가 따로있다.
		// 클래스가 같더라도 생성한 인스턴스가 다르기 때문에 서로 다르다
		

	}

}
