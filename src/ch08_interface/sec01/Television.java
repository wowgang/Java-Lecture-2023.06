package ch08_interface.sec01;
// 구현할때에는 implements (인터페이스할거)
public class Television implements RemoteControllable {
	private int volume;  
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllable.MAX_VOLUME)
			this.volume = RemoteControllable.MAX_VOLUME;
		else if ( volume < RemoteControllable.MIN_VOLUME)
			this.volume = RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

}
