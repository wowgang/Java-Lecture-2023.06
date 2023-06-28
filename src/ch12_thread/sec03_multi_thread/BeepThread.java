package ch12_thread.sec03_multi_thread;

import java.awt.Toolkit;
// Thread 를 상속받는 형태 extends Thread
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i<5; i++) {
			toolkit.beep();	// 소리나는거
			try {
				Thread.sleep(1000);	// 1000 ms 만큼 중지  1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}

}
