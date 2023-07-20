package ch99_quiz;

public class For {

	public static void main(String[] args) {
//		int n = 5; // 줄수
//		int start = 5; 
//		
//		for (int i=0; i<5; i++) {
//			for (int j=0; j<5; j++) {
//				System.out.print(start+j);
//			}
//			start--;
//			System.out.println();
//		}
		
		for (int i=5; i>6; i--) {
			for (int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//main

}
