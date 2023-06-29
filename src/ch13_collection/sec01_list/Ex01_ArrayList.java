package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// 자바는 한개만 리스트를 object로 만들면 여러가지를 넣을수 있음
		// object로 가져오면 9가지 밖에 못가져와서 그렇게는 사용하지않는다는데...
		
		// 자바는 list에 한가지 타입만 넣을수 있다
		List<String> list = new ArrayList<>();	// type세팅 list의 타입을 스트링으로 하겠다.
		// list. 하면 string으로 힌트를 준다 - generic 한것.
		
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		
		System.out.println(list.get(0));	// Java
		System.out.println(list.get(2));	// Servlet
		System.out.println(list.size());	// 3
		
		// list 안에있는 요소 다 꺼내오기
		// 방법1 전동적인 For-loop
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 방법2 Enhanced For-loop
		for (String element: list)
			System.out.print(element + " ");
		System.out.println();
		
		// 방법3 자바11부터 가능 Stream과 Lambda 함수로 처리
		list.forEach(x -> System.out.println(x));	// lambda x: print(x)
		
		list.remove(1);	// 1번 인덱스 요소 삭제
		list.add("JDBC");
		list.add("Spring");
		
		for (String element: list)
			System.out.print(element + " ");
		System.out.println();
		System.out.println(list.get(1));	// Servlet 인덱스 값이 바뀜 //for loop안에서 list요소 삭제하지말기
		
		System.out.println(list.isEmpty());	// list가 비어있는지 false
		System.out.println(list.contains("Spring"));	// list에 Spring 포함하고있는지 true
		
		list.clear();	// 리스트의 모든 엘리먼트 지우기
		System.out.println(list.isEmpty());	// true
		
	
		
		
	}

}


