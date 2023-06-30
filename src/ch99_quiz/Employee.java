package ch99_quiz;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 3. 어느 회사 사원의 직급체계는 다음과 같다.
	부장, 차장, 과장, 대리, 사원
   이 회사 종업원을 사번(id), 이름(name), 직급(position), 입사일자(joinDate) 4개의 필드로
   모델링을 하되, 다음의 조건을 만족해야 한다.
     1. 사번과 이름이 같으면 동일한 사람이다.
     2. 출력을 할 경우에는 직급, 입사일자 순으로 출력이 되어야 한다.
   10명의 테스트 데이터를 만들어 그 결과를 확인해 보세요.
 */

public class Employee implements Comparable {
	private int id;
	private String name;
	private Position position;
	private LocalDate joinDate;
	
	
	public Employee() { }
	public Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return id == emp.getId() && name.equals(emp.getName());
				
	}
	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		if (position.equals(emp.getPosition()))
			return joinDate.compareTo(emp.getJoinDate());
		return position.compareTo(emp.getPosition());
	}
	
}
