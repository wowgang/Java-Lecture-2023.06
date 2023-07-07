package mysql.ex07_bbs;

import org.mindrot.bcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt()); // 모듈에 넣어주기
		System.out.println(cryptedPwd.length() + ", " + cryptedPwd); 
		// 비밀번호  60, $2a$10$dADJ1gAzbumCydnX0MgxmOOtboJEmWKy005iahrih6ytTAWDST6WW
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result); // true
		// BCrypt는 원웨이.. 암호화된거를 바꾸는거는안돼지만 참인지 거짓인지는 알려줌
		
		
	}

}
