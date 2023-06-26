package ch07_inheritance.sec04_polymorphism;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		// 다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어짐
		// 부모라면 List list = new ArrayList(); 라고 대게 쓴다. ( ArrayList list = new ArrayList();  가 맞지만)
		Animal animal = new Cat();
		animal.sound();
		animal = dog; //  이렇게 작성해도 됨 ******
		animal.sound();
		
		// 자식은 부모 타입으로 자동적으로는 사용할 수 없음
//		cat = new Animal();  // 에러 // 불가
//		cat = (Cat) new Animal(); 	// 강제 타입 변환 // 불가
		// cat.sound();		// 예외 발생 

		System.out.println("================================");
		// 부모 타입 객체를 다시 자식 타입으로 대입할 수 있는지 확인한 후 강제 타입 변환할 것 
		// 부모메서드 사용하려면
		// animal 이 어떤 타입인지 확인
//		animal = new Animal(); //  else출력
		animal = cat;
//		animal = dog;
		
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			cat.sound();
		} else if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.sound();
			
		} else {
			System.out.println("cat.sound()/dog.sound()를 사용할 수 없음.");
		}
		System.out.println("================================");
		// animal의 최고 조상은  Object ******
		Object obj = new Animal(); // ******
//		obj.sound();  //는 사용불가 // 다시 자식으로 바꿔준다면 사용가능
		if (obj instanceof Animal) {
			animal = (Animal) obj;  // 자식으로 바꿔줌 ******
			animal.sound();
		}
		
	}

}
