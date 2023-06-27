package ch11_api.sec01_object;

public class Member2 {
	String id;
	String name;
	
	Member2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// equals 매서드를 재정의함
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 m2 = (Member2) obj;
			return (this.id.equals(m2.id) && this.name.equals(m2.name));			
		}
		
		return false;  // 다른객체와 비교하면 무조건 false?
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}
