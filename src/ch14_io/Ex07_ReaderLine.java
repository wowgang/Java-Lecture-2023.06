package ch14_io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * BuffereadReader를 사용하면 line단위로 글을 읽을 수 있음
 */

public class Ex07_ReaderLine {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/test.txt"));
		
		int lineNo = 1;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			System.out.println(lineNo + ": " + line);
			lineNo++;
		}
		br.close();
	}

}
