package ch11_api.sec04_package;

public class Ex07_Substring {

	public static void main(String[] args) {
		// 파이썬에서는 Substring 슬라이싱으로 사용했었는데 자바는 일일이 쪼개어 줘야 함..
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0, 6);	// 0~5까지 880823
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);	// 7부터 끝까지	1234567
		System.out.println(secondPart);	
		
		// 생년월일을 "1988-08-23" 형태로 바꾸기
		String s = ssn.replace("88", "1988");
		System.out.println(s);
		String s1 = s.substring(0,8);
		System.out.println(s1);
		String s2 = s1.replace("1988", "1988-");
		System.out.println(s2);
		String s3 = s2.replace("08", "08-");
		System.out.println(s3);
		
		// 쌤
		// 주민 뒷번호 
		// 1800 남자 9, 여자 0
		// 1900 남자 1, 여자 2
		// 2000 남자 3, 여자 4
		
		// 방법1
//		String ymd = "";
//		if (ssn.charAt(7) == '1' || ssn.charAt(7) == '2')
//			ymd = "19";
//		else
//			ymd = "20";
		
		
		// 방법2
		String ymd = (ssn.charAt(7) == '1' || ssn.charAt(7) == '2') ? "19" : "20";
		
		
		ymd += ssn.substring(0,2) + "-" + ssn.substring(2,4) + "-" + ssn.substring(4,6);
		System.out.println(ymd);
		
		
	}

}
