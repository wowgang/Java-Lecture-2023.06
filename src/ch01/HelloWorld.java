package ch01;



// 이클립스의 단축키 알아보기. Java의 배열에 대한 공부
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!");
		System.out.println("안녕하세요?");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=i*10;	
		}
		printArray(array);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
