package ch07_inheritance.sec01;

/*inheritance(상속)
 * 
 * extends (class 확장)
 * 부모에서 선언
 * 정의를 모두하며 자식은 메소드
 * 변수를 그대로 사용할 수 있음
 * 부모의 메소드를 그대로 사용할 수 있으며 오버라이딩 할 필요 없이 부모에 구현되있는 것을 직접사용가능
 * 
 * implements (interface 구현)
 * 부모 객체는 선언만 하며 정의(내용)은 자식에서 오버라이딩 (재정의) 해서 사용해야함
 * 
 * abstract
 * extends와 interface 혼합. extends하되 몇 개는 추상 메소드로 구현되어 있음
 */


/* // 접근지정자
 * public: All 
 * - A클래스를 B클래스에서 생성하고 a.var; 이게 됨 (다른패키지에서도 가능)
 * protected: 상속 || 동일패키지
 * - 상속시 자식 클래스 -> 부모 클래스 호출 가능(다른패키지ok) 동일 패키지라면 비상속시 ok
 * default: 상속 || 동일패키지
 * private: 클래스 내부에서만 사용가능
 */
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
