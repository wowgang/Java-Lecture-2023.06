package ch99_quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 2. Grep 찾을_문자열(대소문자 구분 없음) 찾을_파일
 */
public class Q2_Grep {

	public static void main(String[] args) {
		grep("String", "c:/Temp/Q1_CountWord.java");
		
	}
	
	static void grep(String word, String filePath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			int lineNo = 0;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				lineNo++;
				String newline = line.toLowerCase();
				if (newline.contains(word.toLowerCase()))
					System.out.printf("%4d:\t%s\n", lineNo, line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
