package ch13_collection.quiz;

import java.util.ArrayList;
import java.util.List;

// Main페이지 출력하는곳
public class BoardDao {
	
	public List<Board> getBoardList() {
//		List<Board> list = new ArrayList<Board>();
		List<Board> list = new ArrayList<>(); // 다이아몬드 연산자(< >)를 사용하여 변수의 타입을 생략할 수 있다.
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
		
	}
	
}
