package ch06;

import java.time.LocalDate;

public class Ex03_CustomerMethod {

	public static void main(String[] args) {
		// return type
		Customer customer = genCustomer(); // new이미 만들었으니.... // 클래스가 타입이되었음 타입자리에있음
		printCustomer(customer);
	}

	static Customer genCustomer() {
		int cid = 1001;
		String name = "James";
		int age = 23;
		LocalDate today = LocalDate.now();
		boolean adult = true;
		Customer customer = new Customer(cid, name, age, today);  // new
		customer.setAdult(adult);
		return customer;  // return value 딱하나임
		
				
	}
	static void printCustomer(Customer c) {
		System.out.println(c);
	}
	
}
