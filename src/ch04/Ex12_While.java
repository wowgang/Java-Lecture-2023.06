package ch04;

public class Ex12_While {

	public static void main(String[] args) {
		// 주사위 던져서 합이 21을 넘으면 탈출
		// 횟수가 정해지지 않을때 while을 쓴다.
		int diceSum = 0;
		while (diceSum <= 21) {
			int dice = 1 + (int) (Math.random() * 6);  
			System.out.println(dice);
			diceSum += dice;
		}
		System.out.println(); System.out.println(diceSum);
		
		// 의도적으로 무한루프를 만들고 탈출 조건을 루프안에서 만들어 줌
		diceSum = 0;
		while (true) {
			int dice = 1 + (int) (Math.random() * 6);  
			System.out.println(dice + " ");
			diceSum += dice;
			if (diceSum > 21)
				break;
		
		}
		System.out.println(); System.out.println(diceSum);
		
		
		// dowhile 
		diceSum = 0;
		do {
			int dice = 1 + (int) (Math.random() * 6);  
			System.out.println(dice + " ");
			diceSum += dice;
		} while (diceSum <= 21);
		System.out.println(); System.out.println(diceSum);
		
		// continue
//		1-100까지 3의 배수가 아닌것의 합
//		3의배수면 continue
		
	}

}
