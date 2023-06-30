package ch13_collection.quiz;

import java.util.List;

// 리시트 만들어서 출력방식? 저장해둔곳

public class B_ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}

}
