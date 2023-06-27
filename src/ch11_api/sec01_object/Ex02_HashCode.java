package ch11_api.sec01_object;

import java.util.HashMap;
import java.util.Map;
// 키,값 저장(put), 읽기(get)
// key가 없다면 null을 넘겨줌
public class Ex02_HashCode {

	public static void main(String[] args) {
		Key key1 = new Key(3);
		Key key2 = new Key(3);
		System.out.println(key1.equals(key2));  // true (equals method재정의 했기 때문에)
		System.out.println(key1.hashCode() + ", " + key2.hashCode());	// 167185492, 592179046
		
		///////// hashCode() 재정의 하기 이전
		// Key는 integer와 다름없다.
		// map에는 두개의 객체,클래스가 필요함 map<Sting,String> 기본
		// String도 클래스인것이다..... 다르게 생각하지말기
		Map<Key, String> hashMap = new HashMap();	// 쌤
//		Map<Key, String> hashMap = new HashMap<Key, String>();  // 책 생략가능
		hashMap.put(key1, "James");
		hashMap.put(key2, "Maria");
		System.out.println(hashMap.get(key1));
		System.out.println(hashMap.get(key2));
		System.out.println("====================");
		
///////// hashCode() 재정의한 후
		Map<Key2, String> hashMap2 = new HashMap();
		Key2 key21 = new Key2(3);
		Key2 key22 = new Key2(3);    // key 값이 같으면 오버라이딩 돼서 값이 바뀐다..
		System.out.println(key21.hashCode() + ", " + key22.hashCode());	
		
		hashMap2.put(key21, "James");		// HashMap은 key가 중복되면 값을 새로이 저장하지 않음
		hashMap2.put(key22, "Maria");		// 기존 key가 가리키는 value를 변경함
		System.out.println(hashMap2.get(key21));  // new Key2(3); 값이 3이라 Maria // hashmap은 key중복안됨
		System.out.println(hashMap2.get(key22));	// Maria
		
		
	}

}
