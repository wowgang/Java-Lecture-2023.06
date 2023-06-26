package ch08_interface.sec02_multiple;

import ch08_interface.sec01.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
		Searchable sc = new SmartTV();
		sc.search("YouTube");
		
		SmartTV stv = new SmartTV(); // 객체로 선언하면 몽땅 양쪽을 다 사용할 수 있다.
		stv.turnOn();
		stv.search("Naver");
		stv.setVolume(7);
		stv.turnOff();
		
	}

}
