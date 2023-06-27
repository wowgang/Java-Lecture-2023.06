package ch10_exception;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		Cat cat;
		Dog dog;
//		Cat cat = (Cat) a1;	// 좋은방법아님
//		Dog dog = (Dog) a2;
		
		
		
//		dog = (Dog) a1;	// 에러 class cast 잘못됨
//		이것을 막기위해 조건식
		if (a1 instanceof Cat)
			cat = (Cat) a1;
		if (a2 instanceof Dog)
			dog = (Dog) a2;
	}
	
// 객체 비교
// CompareTo(object1, object2)
// Camparable

}


class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}

