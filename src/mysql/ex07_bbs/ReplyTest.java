package mysql.ex07_bbs;

import mysql.ex07_bbs.dao.ReplyDao;
import mysql.ex07_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao rDao = new ReplyDao();
		
//		Reply r1 = new Reply("첫번째 댓글", "james", 2);
//		rDao.insertReply(r1);
		rDao.insertReply(new Reply("댓글 1", "james", 1));
		
		
//		List<Reply> list = rDao.getReplyList();

	}

}
