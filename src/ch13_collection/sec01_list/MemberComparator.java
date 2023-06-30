package ch13_collection.sec01_list;

import java.util.Comparator;


public class MemberComparator implements Comparator<Member>{
	@Override
	public int compare(Member m1, Member m2) {
		if (m1.getAge() == m2.getAge())
			return m1.getName().compareTo(m2.getName());
		return -(m1.getAge() - m2.getAge());
	}
	
	
}


/**
 * 나이의 오름차순 정렬
 */
class MemberAgeComparator implements Comparator<Member> {
	@Override
	public int compare(Member m1, Member m2) {
		return m1.getAge() - m2.getAge();
	}
}

/**
 * 이름의 내림차순
 */
class MemberNameComparator implements Comparator<Member> {
	@Override
	public int compare(Member m1, Member m2) {
		return -m1.getName().compareTo(m2.getName());
		
	}
}