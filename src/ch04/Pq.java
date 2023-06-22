package ch04;

// 연습문제 p147 3,4

// 연습문제 p160-162 2,3,4,7
// 연습문제 p200-201 4,5,6
// 1-100 FizzBuzz

public class Pq {

	public static void main(String[] args) {
		// 연습문제 p147 3,4
		// 3번: 등급은 B입니다.
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("vvip");
		case 'B':
			System.out.println("vip");
		case 'C':
			System.out.println("우수");
		case 'D':
			System.out.println("일반");
			break;
		default:
			System.out.println("혜택없"); // 출력 안됨
		}
		System.out.println("감사");

		// 연습문제 p160-162 2,3,4,7
		// Q2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println("3배수 총합은: " + sum);

		// Q3. while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때
		// 나오는 눈을 (눈1,눈2)형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
		// 눈의 합이 5이면 실행을 멈추는 코드를 작성
		int diceSum = 0;
		while (true) {
			int dice1 = 1 + (int) (Math.random() * 6);
			int dice2 = 1 + (int) (Math.random() * 6);
			System.out.println(dice1 + ", " + dice2);
			diceSum = dice1 + dice2;
					if ((dice1+dice2) ==5 )
						break;
		}
		System.out.println("눈의 합이 "+ diceSum);
		
		// Q4. 중첩for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력
		// 단 x,y는 10 이하의 자연수
		for (int x=1; x<11; x++) {
			for (int y=1; y<11; y++) {
				if (4*x + 5*y == 60)
					System.out.println("4x + 5y = 60의 해 x:" + x + "," + y);
			}
		}
		
		// Q5. for문을 이용해서 1사분면
		// Q6. for문을 이용해서 3사분면
		
		


		
		
		
		
		
	} // public static

}
