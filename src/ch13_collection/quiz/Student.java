package ch13_collection.quiz;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	// public이라서 getter/setter가 꼭 필요하지않음
	
	@Override
	public int hashCode() {
//		return Objects.hash(studentNum);  이것 보다는 아래와같이 작성하는것을 권장
		return this.studentNum;
//		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) 
			return false;
		Student student = (Student) obj;
		return this.studentNum == student.studentNum;	// 학번이 같음
	}
	
	
}
