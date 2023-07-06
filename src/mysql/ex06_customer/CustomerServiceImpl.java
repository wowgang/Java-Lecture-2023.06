package mysql.ex06_customer;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao cDao = new CustomerDao();
	private Scanner scan = new Scanner(System.in);
	
	public void listCustomer() {
		List<Customer> list = cDao.getCustomerList();
		for (Customer c: list)
			System.out.println(c);
	}
	
	// 등록
	public void registerCustomer() {
		String uid = null;
		while (true) {	// unique한 uid를 받을 때 까지 반복
			System.out.print("UID> ");
			uid = scan.nextLine(); 
			Customer c = cDao.getCustomer(uid);
			if (c == null)
				break;
			System.out.println("중복된 ID 입니다. 다시 입력하세요.");
		}
		System.out.println("이름> ");
		String uname = scan.nextLine();
		cDao.insertCustomer(new Customer(uid, uname));
		System.out.println("고객 등록을 마쳤습니다.");
	}
	
	public void updateCustomer() {
		Customer c = null;
		String uid = null;
		while (true) {
			System.out.print("UID> ");
			uid = scan.nextLine();
			c = cDao.getCustomer(uid); // 여까지 정보를 가져온것
			if (c != null)
				break;
			System.out.println("잘못된 ID 입니다. 다시 입력하세요.");
		}
		System.out.println("이름 (" + c.getUname() + ")> ");
		String uname = scan.nextLine();
		System.out.println("등록일 (" + c.getRegDate().toString() + ")> ");
		String regDate = scan.nextLine();
		c = new Customer(uid, uname, LocalDate.parse(regDate), 0);
		cDao.updateCustomer(c);
		System.out.println("고객 수정을 마쳤습니다.");
	}
	
	public void deleteCustomer() {
		String uid = null;
		while (true) {
			System.out.print("UID> ");
			uid = scan.nextLine();
			Customer c = cDao.getCustomer(uid); // 여까지 정보를 가져온것
			if (c != null)
				break;
			System.out.println("잘못된 ID 입니다. 다시 입력하세요.");
		}		
		cDao.deleteCustomer(uid);
		System.out.println("고객 탈퇴를 마쳤습니다.");
	}
}
