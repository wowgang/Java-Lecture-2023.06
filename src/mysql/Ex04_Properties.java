package mysql;

import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;

import ch13_collection.sec03_map.Ex03_Properties;

public class Ex04_Properties {

	public static void main(String[] args) throws Exception {
		// 상대경로
		Properties prop = new Properties();		// Mam<String, String>
			// mysql.properties 파일 로드
			// 예외 처리 필요 throws IOException
		prop.load(Ex04_Properties.class.getResourceAsStream("mysql.properties"));
		
		// 절대경로
		Properties props = new Properties();
		InputStream is = new FileInputStream("D:/JavaWorkspace/JavaLecture/src/mysql/mysql.properties");
		props.load(is);
		is.close();
		
		String host = props.getProperty("host");
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String database = props.getProperty("database");
		String port = props.getProperty("port");
		String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr, user, password);");
		
	}

}
