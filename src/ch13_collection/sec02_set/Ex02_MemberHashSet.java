package ch13_collection.sec02_set;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {

	public static void main(String[] args) {
		Member m1 = new Member(24, "James", "010-2345-6789");
		Member m2 = new Member(45, "James", "010-2345-6790");
		Member m3 = new Member(24, "Maria", "010-2345-6791");
//		Member m4 = new Member(24, "Maria");
		
		// 해시코드 값이 어떻게 나오는지 확인
		System.out.printf("%d, %d, %d\n", m1.hashCode(), m2.hashCode(), m3.hashCode());
//		System.out.printf("%d, %d, ,%d, %d\n", m1.hashCode(), m2.hashCode(), m3.hashCode(), m4.hashCode());
		
		
		Set<Member> set = new HashSet<>();
		set.add(m1); set.add(m2);  set.add(m3);
		set.add(new Member(24, "James", "010-2345-6792"));	// 중복이라 size보면 안들어 갔음을 확인할수있다
		System.out.println(set.size());
		
		for (Member m: set)
			System.out.println(m);	// 순서 보장안됨
	}

}
