package ch13_collection.sec02_set;

import java.util.Objects;

public class Member {
	// 필드
	private int age;
	private String name;
	private String tel;
	
	// 나이,이름이 같으면 중복
	
	// 생성자
	public Member() { }
	public Member(int age, String name, String tel) {
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// 해시코드
	@Override
	public int hashCode() {
		return Objects.hash(age,name);
		
//		return Objects.hash(name); // 이름만 가지고 비교
//		return Objects.hash(age); // 나이만 가지고 비교
		
	}
	
	// 이콜스 코드
	@Override
	public boolean equals(Object obj) {
		// obj가 멤버 타입인지 따져주기
		if (!(obj instanceof Member))
			return false;
		Member mem = (Member) obj;
		return this.age == mem.getAge() && this.name.equals(mem.getName());
//		return this.name.equals(mem.getName());	// 이름만 가지고 비교
//		return this.age == mem.getAge();	// 나이만 비교
	}
	
	
	@Override
	public String toString() {
//		return "Member [age=" + age + ", name=" + name + "]";
		return "Member [age=" + age + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
