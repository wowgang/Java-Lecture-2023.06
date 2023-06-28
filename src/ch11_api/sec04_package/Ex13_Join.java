package ch11_api.sec04_package;

public class Ex13_Join {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArray = fruits.split(", ");
		String fruitStr = String.join(" -:- ", fruitArray);
		System.out.println(fruitStr);	// 감-:-배-:-귤-:-밤
		
		
		// PATH
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArray = paths.split(";");
		// for loop 말고도 join으로 뽑아 낼 수 있다.
		String pathStr = String.join("\n", pathArray); // "\n" 제거요소
		System.out.println(pathStr);
		

	}

}
