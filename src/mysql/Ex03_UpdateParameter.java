package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex03_UpdateParameter {

	public static void main(String[] args) {
		update(2338, "성남", 900000);
		// 여기서 실행하면 업데이트만. 결과물 확인은 Ex01_Select 에서  

	}
	
	static void update(int id, String city, int population) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world", 
					"ysuser", "yspass");
			String sql = "Update city set name=?, population=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// sql query문에서 물음표 순서대로 파라메터값 세팅하기
			pstmt.setString(1, city);	// name 
			pstmt.setInt(2, population);
			pstmt.setInt(3, id);
			
			// return type이 있을 경우 => ResultSet rs = pstmt.executeQuery();
			// 반환값이 없는 Query
			pstmt.executeUpdate();	// updatd라서 update가 아님
			
			pstmt.cancel(); conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
