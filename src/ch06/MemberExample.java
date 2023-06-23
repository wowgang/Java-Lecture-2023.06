package ch06;

public class MemberExample {

	public static void main(String[] args) { //return type이 없을경우 void????????
		Member member1 = new Member();
		member1.setName("James");
		member1.setAge(23);
		member1.setEmail("james@gamil.com");
		System.out.println(member1);
		
		// 생성자 함수를 써줬기때문에 여기서 생성할수있는것
		Member member2 = new Member("Maria", 21, "maria@naver.com");
		System.out.println(member2);
		
		Member member3 = new Member("Brian", 30);
		System.out.println(member3);
		
		Member member4 = new Member("Tommy");
		System.out.println(member4);
		int totalAge = member1.getAge() + member2.getAge() + 
						member3.getAge() + member4.getAge();
		System.out.println(totalAge);
				
	}
	

}
