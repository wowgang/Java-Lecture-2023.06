package ch06_class;

public class Ex08_RoadAddr {

	public static void main(String[] args) throws Exception {
		RoadAddress roadAddress = new RoadAddress();
		String roadAddr = roadAddress.getRoadAddr("장안구청");
		System.out.println(roadAddr);
	}

}
