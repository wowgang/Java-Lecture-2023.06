package ch06_class;

public class Calculator_Example {

	public static void main(String[] args) {
		Caculator caculator = new Caculator();
		int addc = caculator.add(4,2); 
		int subc = caculator.sub(4,2); 
		int mulc = caculator.mul(4,2); 
		double divc = caculator.div(4,2);
		
		System.out.printf("%d, %d, %d, %.2f\n",addc,subc,mulc,divc);
		
		int x =10, y=20;
	      
		System.out.println("10 + 20 = " + caculator.add(x, y));
		System.out.println("10 - 20 = " + caculator.sub(x, y));
		System.out.println("10 * 20 = " + caculator.mul(x, y));
		System.out.println("10 / 20 = " + caculator.div(x, y));
	      
		
	}

}
