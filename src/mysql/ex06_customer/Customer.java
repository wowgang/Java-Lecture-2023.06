package mysql.ex06_customer;

import java.time.LocalDate;
/*
 * customer table
 * 
 CREATE TABLE if NOT EXISTS customer (
	uid varchar(12) PRIMARY KEY,
	uname VARCHAR(12) NOT NULL,
	regDate DATE DEFAULT(CURRENT_DATE),
	isDeleted INT DEFAULT 0
 );
 */

public class Customer {
	private String uid;
	private String uname;
	private LocalDate regDate;
	private int isDeleted;	// 가입 - 0, 탈퇴 - 1
	
	
	public Customer() { }
	public Customer(String uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
//		this.regDate = regDate;	// DEFAULT 값이라 지움
//		this.isDeleted = isDeleted; // DEFAULT 값이라 지움
	}
	public Customer(String uid, String uname, LocalDate regDate, int isDeleted) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.regDate = regDate;	// DEFAULT
		this.isDeleted = isDeleted; // DEFAULT
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", uname=" + uname + ", regDate=" + regDate + ", isDeleted=" + isDeleted + "]";
	}
	
}
