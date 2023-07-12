package mysql.ex07_bbs;

import java.util.List;

import mysql.ex07_bbs.dao.ReplyDao;
import mysql.ex07_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao rDao = new ReplyDao();
		
//		Reply r1 = new Reply("첫번째 댓글", "james", 2);
//		rDao.insertReply(r1);
//		rDao.insertReply(new Reply("댓글 3", "james", 1));
		
		
//		List<Reply> list = rDao.getReplyList(3,1); // 10개의 데이터를조회 0번인덱스부터
		List<Reply> list = rDao.getReplyList(); 
		for (Reply r: list)
			System.out.println(r);

	}

}
