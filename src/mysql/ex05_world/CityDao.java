package mysql.ex05_world;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CityDao {
	// properties에서 썼던걸 쓰려는것
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public CityDao() {
		try {
			Properties props = new Properties();
			InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection myConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public City getCityById(int id) {
		Connection conn = myConnection();
		String sql = "select * from city where id=?";
		City city = new City();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			// Select 실행
			// DB가 어떤 타입인지 적어놓고 있으면 좋다.
			ResultSet rs = pstmt.executeQuery();	// sql 빼기
			while (rs.next()) {	
				city.setId(rs.getInt(1));
				city.setName(rs.getString(2));
				city.setCountryCode(rs.getString(3));
				city.setDistrict(rs.getString(4));
				city.setPopulation(rs.getInt(5));
				
				// 아래를 위와같이 바꿈
//				id = rs.getInt(1);	// 컬럼인덱스 첫번째 컬럼 id , 정수형
//				String name = rs.getString(2);	// 두번째 컬럼 ,String type
//				String countryCode = rs.getString(3); 
//				String district = rs.getString(4);
//				int population = rs.getInt(5);
			}
			
			rs.close(); pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return city;
	}
	
	public City getCityByName(String name) {
		Connection conn = myConnection();
		String sql = "SELECT * FROM city WHERE name=?;";
		City city = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);
			
			ResultSet rs = pstmt.executeQuery();	// sql 빼기
			while (rs.next()) {	
				int id = rs.getInt(1);	// 컬럼인덱스 첫번째 컬럼 id , 정수형
				name = rs.getString(2);	// 두번째 컬럼 ,String type
				String countryCode = rs.getString(3); 
				String district = rs.getString(4);
				int population = rs.getInt(5);
				city = new City(id, name, countryCode, district, population);
//				city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			
			} 
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city;
	}
	
	// 10개의 도시 가져오기 => return 할 타입... List<City>
	public List<City> getCityList(String countryCode, int num) {
		List<City> list = new ArrayList<City>();
		Connection conn = myConnection();
		try {
			String sql = "select * from city where countrycode=? limit ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,countryCode);
			pstmt.setInt(2,num);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				City city = new City(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				list.add(city);
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// insert는 return 타입x => return 타입이 없으면 void 
	public void insertCity(City city) {
		Connection conn = myConnection();
		try {
			String sql = "insert into city values(default, ?, ?, ?, ?)";
			// id는 auto increment라서 공란으로 둠 / id 없는 나머지값이 있는 생성자 추가로 만들어줬음(City.java)
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateCity(City city) {
		Connection conn = myConnection();
		try {
			String sql = "update city set name=?, countrycode=?, district=?, population=? where id=?";
			// id는 auto increment라서 공란으로 둠 / id 없는 나머지값이 있는 생성자 추가로 만들어줬음(City.java)
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, city.getName());
			pstmt.setString(2, city.getCountryCode());
			pstmt.setString(3, city.getDistrict());
			pstmt.setInt(4, city.getPopulation());
			pstmt.setInt(5,  city.getId());	// id 추가
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteCity(int id) {
		Connection conn = myConnection();
		try {
			String sql = "delete from city where id=?";
			// id는 auto increment라서 공란으로 둠 / id 없는 나머지값이 있는 생성자 추가로 만들어줬음(City.java)
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
