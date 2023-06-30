package ch14_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06_BufferIO {

	public static void main(String[] args) throws Exception {
		// Case1
		FileInputStream fis = new FileInputStream("c:/Temp/박태환1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/Temp/target1.png");
		
		// Case2
		FileInputStream fis2 = new FileInputStream("c:/Temp/박태환2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/Temp/target2.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//성능 비교
		long noBufferTime = copy(fis, fos);	
		System.out.println("버퍼 미사용: " + noBufferTime + " ns");
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용: " + bufferTime + " ns");
		
		bis.close(); bos.close(); fis2.close(); fos2.close();
		fis.close(); fos.close();
		
		// 버퍼를 사용하지 않으면 더 오래 걸림

	}
	
	static long copy(InputStream is, OutputStream os) throws Exception {
		long startTime = System.nanoTime();
		// 1바이트 단위로 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
		
		
	}
	
}
