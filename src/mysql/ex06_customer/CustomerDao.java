package mysql.ex06_customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CustomerDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	public CustomerDao() {
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
	
	
	public Customer getCustomer(String uid) {
		Customer c = null;
		Connection conn = myConnection();
		String sql = "select * from customer where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  uid);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				uid = rs.getString(1);
				String uname = rs.getString(2);
				LocalDate regDate = LocalDate.parse(rs.getString(3));	// toString안해도 타입이 맞춰졌다
				int isDeleted = rs.getInt(4);
				c = new Customer(rs.getString(1), rs.getString(2),  
						LocalDate.parse(rs.getString(3)), rs.getInt(4));
			}
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public List<Customer> getCustomerList() {
		List<Customer> list = new ArrayList<Customer>();
		Connection conn = myConnection();
		String sql = "select * from customer where isDeleted=0"; // 탈퇴하지않은사람
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String uid = rs.getString(1);
				String uname = rs.getString(2);
				//LocalDate regDate = LocalDate.parse(rs.getDate(3).toString());
				LocalDate regDate = LocalDate.parse(rs.getString(3));	// toString안해도 타입이 맞춰졌다
				int isDeleted = rs.getInt(4);
				Customer c = new Customer(uid, uname, regDate, isDeleted);
				list.add(c);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertCustomer(Customer c) {
		Connection conn = myConnection();
		String sql = "insert into customer values (?, ?, default, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getUid());
			pstmt.setString(2, c.getUname());
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateCustomer(Customer c) {
		Connection conn = myConnection();
		try {
			String sql = "update customer set uname=?, regDate=?, isDeleted=? where uid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getUname());
			pstmt.setString(2, c.getRegDate().toString());
			pstmt.setInt(3, c.getIsDeleted());
			pstmt.setString(4, c.getUid());
			
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(String uid) {
		Connection conn = myConnection();
		try {
			String sql = "update customer set isDeleted=1 where uid=?"; // delete가 아니라 update임
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  uid);
			pstmt.executeUpdate();
			pstmt.close(); conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
