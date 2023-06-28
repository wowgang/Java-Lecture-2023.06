package ch11_api.sec04_package;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Ex04_GetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException{
		String str = "안녕하세요?";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);	// 16 (UTF-8로 encoding 되어 있음)
		System.out.println(new String(bytes1));	// bytes1을 String으로 변환 , 원위치 8번라인으로 만든것
		System.out.println(Arrays.toString(bytes1));
		System.out.println();
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);	// 11 ("EUC-KR"로 encoding 되어 있음)
		System.out.println(new String(bytes2, "EUC-KR"));	// bytes2을 String으로 변환 , 원위치 8번라인으로 만든것
		System.out.println(Arrays.toString(bytes2));
		System.out.println();
	}

}
