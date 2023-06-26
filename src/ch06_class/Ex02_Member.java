package ch06_class;

public class Ex02_Member {

	// 속성, 필드
	private String name;
	private int age;
	private String email;
	
	// 생성자 함수
	// source -> Generate contructor using fields
	public Ex02_Member() { }
	public Ex02_Member(String name) {
		super();
		this.name = name;
	}
	public Ex02_Member(String name, int age) {
		super();
		this.name = name;
		if (age >= 0 && age <=150)
		this.age = age;
	}
	public Ex02_Member(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		if (age >= 0 && age <=150)
		this.email = email;
	}
	
	
	
	// 메소드
	// 오른쪽마우스 source -> Generate  getters ans setters
	// private이어도 다른곳에서 사용할수있도록	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0 && age <=150)
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// Generate toString 이거까지해야 다른곳에서 내용이 보임
	// 오른쪽마우스 source -> Generate toString 
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	//
}
