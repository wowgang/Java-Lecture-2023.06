package ch14_io;

//import java.io.*;
import java.io.InputStream;
import java.util.Arrays;
import java.io.FileInputStream;

public class Ex02_InputStream {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test.db");
		// 방법 하나씩 읽어야함
		
		// 방법1
//		while (true) {
//			int data = is.read(); 	// read는 byte 단위로 읽는다...  1 byte 읽기
//			if (data == -1)
//				break;
//			System.out.print(data + " ");
//		}
		
		
		// 방법2
		byte[] arr = new byte[20];	// 20개중 11개 사용함
		while (true) {
			int num = is.read(arr);
			System.out.println("읽은 바이트 수: " + num);
			if (num == -1)
				break;
		}
		System.out.println(Arrays.toString(arr)); 
		
		is.close();
		
		
	}

}
