package ch06_class;

import java.time.LocalDate;

public class Customer {
	private int cid;
	private String name;
	private int age;
	private LocalDate regDate;
	private boolean adult;
	
	
	public Customer() { } // 빈 생성자를 하나 만듦
	public Customer(int cid, String name, int age) {
		this(cid, name, age, LocalDate.now()); // argument가 작은놈이 큰거를 부를수있게?
	}
	
	
	// consturnctor 생성자
	public Customer(int cid, String name, int age, LocalDate regDate) {
//		super(); //사용x
		this.cid = cid;
		this.name = name;
		if (age >= 0 && age <=150) // 여기에 한번만 써줘도 됨 아까는 다(생성자마다?) 써줌
		this.age = age;
		this.regDate = regDate;
	}
	
	
	// getter,setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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
		this.age = age;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	// adult 만들고 setter,getter 했는데 isault로 나옴
	public boolean isAdult() {   // boolean type의 getter의 이름은 isField()
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", regDate=" + regDate + ", adult=" + adult
				+ "]";
	}
	
	
	// toString()
	
	
}
