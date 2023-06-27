package ch10_exception;

import java.io.BufferedReader;
//import java.io.FileNotFoundException; // catch Exception
import java.io.FileReader;
//import java.io.IOException;	// catch Exception
// throw exception

public class Ex05_FileExample {

	public static void main(String[] args) {
		String key = null; // try 밖에서 key=null 선언해주고 try안에 key를 읽어야함
		try {
			FileReader fr = new FileReader("C:/Users/YONSAI/Downloads/roadapikey.txt");
			BufferedReader br = new BufferedReader(fr);
			key = br.readLine();
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(key);
	}

}
