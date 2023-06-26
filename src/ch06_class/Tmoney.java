package ch06_class;

public class Tmoney {
	//필드
	private int age;
	private int cash;
	public static final int CHILD_FARE = 730;
	public static final int YOUTH_FARE = 1010;
	public static final int ADULT_FARE = 1450;
	
	
	
	//생성자 
//	Tmoney(age)
//	Tmoney(age, cash)
	
	public Tmoney(int age) {
		this.age = age;
	}
	public Tmoney(int age, int cash) {
		this.age = age;
		this.cash = cash;
	}
	
	public int getCash() {
		return this.cash;
	}
	public void charge(int cash) {
		this.cash += cash;
	}
	public boolean ride() {
		if (age >= 7 && age <= 12) {
			if (this.cash >= this.CHILD_FARE) {
				this.cash -= this.CHILD_FARE; return true;
			} 
			return false;
		} else if (age >= 13 && age <= 18) {
			if (this.cash >= this.YOUTH_FARE) {
				this.cash -= this.YOUTH_FARE; return true;
			} 
			return false;
		} else if (age >= 19) {
			if (this.cash >= this.ADULT_FARE) {
				this.cash -= this.ADULT_FARE; return true;
			} 
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	
	//메소드
//	ride(boolean )  잔액부족 false / true
//	7<=age<=12 -730
//	13<=age<=18 -1010
//	19<=age -1450
	
	//메소드
//	charge(int cash)
//	getCash()
	
}
