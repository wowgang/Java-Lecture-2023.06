package ch11_api.sec03_class;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Car car = new Car("Model 3", "Tesla");
		Class clazz = car.getClass();
		System.out.println(clazz.getName());				// ch11_api.sec03_class.Car
		System.out.println(clazz.getSimpleName());			// Car
		System.out.println(clazz.getPackageName());			// ch11_api.sec03_class
		System.out.println(clazz.getPackage().getName());	// ch11_api.sec03_class
		System.out.println("========================");
		
		clazz = Class.forName("ch11_api.sec03_class.Car");	// throws 줘서 try안함
		System.out.println(clazz.getName());				// ch11_api.sec03_class.Car
		System.out.println(clazz.getSimpleName());			// Car
		System.out.println(clazz.getPackageName());			// ch11_api.sec03_class
		System.out.println(clazz.getPackage().getName());	// ch11_api.sec03_class
		
		System.out.println("========================");
		clazz = Car.class;
		System.out.println(clazz.getName());				// ch11_api.sec03_class.Car
		
		System.out.println(clazz.getResource("test.txt"));
		// file:/D:/JavaWorkspace/JavaLecture/bin/ch11_api/sec03_class/test.txt
	}

}
