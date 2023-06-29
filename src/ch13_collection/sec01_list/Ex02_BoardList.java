package ch13_collection.sec01_list;

//import java.util.*; 이렇게 사용할수있으나 권장하지않음

import java.util.ArrayList;
import java.util.List;


public class Ex02_BoardList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new Board(1, "James", "글 제목", "글 내용"));
		list.add(new Board(2, "Maria", "Title", "Content"));
		
		//객체 순회 출력
		for (Board board: list)
			System.out.println(board);
		
	//2	
		list = generateBoard(3);	// 함수에서 넘겨준 list
		for (Board board: list)
			System.out.println(board);
		
		Board board = searchBoard(list, 102); // bid만 주고 찾은것
		System.out.println("검색결과: " + board);
		
	}
	//1
	// List<Board>  이게 타입임
	private static List<Board> generateBoard(int count) {
		List<Board> list = new ArrayList<Board>();
		for (int i=1; i<=count; i++) {
			Board board = new Board(100+i, "저자"+i, "제목"+i, "글 내용"+i);
			list.add(board);
//			list.add(new Board(100+i, "저자"+i, "제목"+i, "글 내용"+i));
		}
		return list;
	}
	
	
	private static Board searchBoard(List<Board> list, int id) {
		for (Board board: list) {
			if (board.getBid() == id)	// id얻어와서 
				return board;
		}
		return null;
	
		
		
	
	} // main
	
}
