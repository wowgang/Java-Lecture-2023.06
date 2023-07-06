package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_SelectParameter {

	public static void main(String[] args) {
		select("KOR", 10);

	}
	
	static void select(String countryCode, int num) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world", 
					"ysuser", "yspass");
			String sql = "select * from city where countrycode=? limit ?";
			
			// SQL에 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countryCode);	// 첫번째 ? 는 countryCode이다.
			pstmt.setInt(2, num);
			
			// Select 실행
			// DB가 어떤 타입인지 적어놓고 있으면 좋다.
			ResultSet rs = pstmt.executeQuery();	// sql 빼기
			while (rs.next()) {	
				int id = rs.getInt(1);	// 컬럼인덱스 첫번째 컬럼 id , 정수형
				String name = rs.getString(2);	// 두번째 컬럼 ,String type
				countryCode = rs.getString(3); 
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d, %s, %s, %s, %d%n", id, name, countryCode, district, population);
			}
			
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
