package ch13_collection.sec01_list;

import java.util.List;

public interface BoardDao {
	List<Board> getBoardList(int count);		// count 갯수 만큼의 Board의 List 반환
	
	Board getBoard(int bid);		// bid 검색 결과 반환
	
	Board getBoardBySubject(String subject);	// subject 검색 결과 반환
	
	void insertBoard(Board board); // 어떤 글을 insert할때 return값이 void
	
	void updateBoard(Board board);
	
	void deleteBoard(int bid); // 보통 딜리트할때 아이디로 하기 때문
}
