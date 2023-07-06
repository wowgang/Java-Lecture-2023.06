package mysql.ex06_customer;

import java.util.Scanner;

public class Application {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean run = true;
		CustomerService cs = new CustomerServiceImpl();
		while (run) {
			System.out.println("+----------+------------+------------+------------+-------+");
			System.out.println("1.고객목록 | 2.고객등록 | 3.정보수정 | 4.고객탈퇴 | 5.종료 |");
			System.out.println("+----------+------------+------------+------------+-------+");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				cs.listCustomer(); break;
			case 2:
				cs.registerCustomer(); break;
			case 3:
				cs.updateCustomer(); break;
			case 4:
				cs.deleteCustomer(); break;	// update도 해줌.. isselect가 0인것만
			case 5:
				run = false; System.out.println("프로그램을 종료합니다.");break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}

	}

}
