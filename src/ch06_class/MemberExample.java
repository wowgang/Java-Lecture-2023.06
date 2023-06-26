package ch06_class;

public class MemberExample {

	public static void main(String[] args) { //return type이 없을경우 void????????
		Ex02_Member member1 = new Ex02_Member();
		member1.setName("James");
		member1.setAge(23);
		member1.setEmail("james@gamil.com");
		System.out.println(member1);
		
		// 생성자 함수를 써줬기때문에 여기서 생성할수있는것
		Ex02_Member member2 = new Ex02_Member("Maria", 21, "maria@naver.com");
		System.out.println(member2);
		
		Ex02_Member member3 = new Ex02_Member("Brian", 30);
		System.out.println(member3);
		
		Ex02_Member member4 = new Ex02_Member("Tommy");
		System.out.println(member4);
		int totalAge = member1.getAge() + member2.getAge() + 
						member3.getAge() + member4.getAge();
		System.out.println(totalAge);
				
	}
	

}
