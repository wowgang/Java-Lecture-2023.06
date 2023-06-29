package ch13_collection.sec01_list;

//게시판
public class Board {
	// 필드  
	// private로 직접적인 접근을 할 수 없도록 막고  getter/setter메서드를 통해서만 접근할 수 있도록 제한
	// 메인에서는 setter메서드를 사용하여, 값을 초기화 
	// 메인에서 데이터 호출시 필드 값을 직접 호출하는 것이 아닌 getter 메서드를 통해 해당 필드 값을 가져오는 방식
	private int bid;	// id 
	private String writer;
	private String subject;
	private String content;
	
	
	
	// 생성자
	public Board() { } // 생성자 추가
	// id가 빠진 생성저 추가  
	// id는 보통 자동으로 만들어지는거라 우리가 값을몰라서 못불러오기때문
	
	public Board(String writer, String subject, String content) {
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}
	
	public Board(int bid, String writer, String subject, String content) {
		this.bid = bid;
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", writer=" + writer + ", subject=" + subject + ", content=" + content + "]";
	}
	
	
}
