package ch11_api.sec07_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01_Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);	// Wed Jun 28 12:33:36 KST 2023
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd a HH:mm:ss");
		System.out.println(sdf.format(now));	// 2023-06--28 오후 12:35:52
		sdf = new SimpleDateFormat("yy-MM--dd a HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}
