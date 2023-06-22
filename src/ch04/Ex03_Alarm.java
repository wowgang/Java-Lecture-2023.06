package ch04;
// # 45분 일찍 알람 설정하기


import java.util.Scanner;

public class Ex03_Alarm {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int h, m;
		
		System.out.print("시간을 입력하세요: ");
		h = Integer.parseInt(scan.nextLine());
		
		System.out.print("분을 입력하세요: ");
		m = Integer.parseInt(scan.nextLine());
		scan.close();
				
		int seth;
		int setm;
		
		if (m >= 45) {
			setm = m - 45;
			seth = h;
			
		} else {
			seth = h-1;
			setm = m + 60 - 45;
			if (h == 0)
				seth = 23;
		}
		System.out.printf("%02d:%02d", seth, setm);
//		System.out.println(seth + "시" + setm + "분");
		
		
		
		
		
		
	}

}
