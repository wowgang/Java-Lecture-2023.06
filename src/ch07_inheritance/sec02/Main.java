package ch07_inheritance.sec02;

public class Main {

	public static void main(String[] args) {
		// 
		Parent parent = new Parent();
		Child child = new Child(300); // super이용하기
		
//		parent.parentInt = 1000;
		parent.parentMethod(); // int는 0으로 초기화 별도객체
		
//		child.childInt = 300;
		child.childMethod(); // 300
		
		// child가 상속받은 parent의 속성/메소드 이용
		// child.parentInt = 2000; // 생략해보기
		// child.parentMethod(); // 2000  // 생략해보기
		
		// child가 상속받은 Parent instance와 parent instance는 다른 객체임.
//		parent.parentMethod();  // 1000   // int는 0으로 초기화 
		child.parentMethod();// 600 super를 해서 600이 나오는거임
		// parent의 객체가 따로있고 child.parent객체가 따로있다.
		// 클래스가 같더라도 생성한 인스턴스가 다르기 때문에 서로 다르다
		

	}

}
