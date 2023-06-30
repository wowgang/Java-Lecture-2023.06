package ch14_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_Copy {

	public static void main(String[] args) throws Exception {
		String srcfile = "c:/Temp/고양이.jpg";	// 파일을 복사하는것임
		String dstFile = "c:/Temp/cat.jpg";		// 여기에 이렇게
		
		InputStream is = new FileInputStream(srcfile);
		OutputStream os = new FileOutputStream(dstFile);
		
		byte[] data = new byte[1024]; // 1024 = 1KB
		while (true) {
			int num = is.read(data);	// 읽었으면 읽은 데이터 갯수, 없으면 -1을 return
			if (num == -1)
				break;
			os.write(data, 0, num);		// 1024를 넣었지만 맨 마지막은 1024가 아닐것이기 때문에 num을 넣어줌
		}
		
		os.flush(); os.close(); is.close();
		System.out.println("복사가 끝났습니다.");
		

	}

}
