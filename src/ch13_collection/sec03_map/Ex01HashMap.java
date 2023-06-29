package ch13_collection.sec03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();		// 순서 보장x
//		Map<String, Integer> map = new TreeMap<>();		// key의 순서 보장 뒤늦게 들어간게 먼저 나옴
		
		map.put("사과", 1000); map.put("배", 2000);  map.put("감", 800);
		System.out.println(map.size());	// 3
		
		
		// key로 값 얻기
		int val = map.get("배");
		System.out.println("배: " + val);	// 배: 2000
		System.out.println("============================");
		
		// key는 타입이 String이다 지금
		// key의 Set collection - 이 방법을 사용하길 권장함
		Set<String> keySet = map.keySet();
		for (String key: keySet)
			System.out.println(key + " : " + map.get(key));
		System.out.println("============================");
		
		
		// Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry: entrySet)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		System.out.println("============================");
		
		// Stream으로 처리
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("============================");
		
		// 검색
		System.out.println(map.containsKey("Apple"));	// false
		System.out.println(map.containsValue(2000));	// true
		
		//값 변경
		map.put("사과",1500);
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("============================");
		
		// entry 삭제
		map.remove("감");
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("============================");
		
		
		
		
		
		
	}// main

}
