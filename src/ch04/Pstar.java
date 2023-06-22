package ch04;

public class Pstar {

	public static void main(String[] args) {
		// 1사분면 
		for (int i=0; i<5; i++) {
			for (int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 4사분면 
		for (int i=0; i<5; i++) {
			for (int k=0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
	} // public static

}
