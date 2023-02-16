package ex01_connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass {

	
	public static void ex01() {
		
		//클래스를 로드하는 방법 (메모리에 로드한다 : 사용하겠다)
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); //oracle.jdbc.driver.OracleDriver도 가능하다 
			System.out.println("클래스가 로드되었습니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void ex02() {
		
		//Oracle DataBase와 연결할 때 사용하는 Connection Interface
		Connection con = null;
		// 예외처리가 필요하기 때문에 일단은 선언만 한다 
		
		// Oracle 접속 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		//thin 가벼운 jdbc라고 생각 (오라클 쓰는 이상 언제나 필요한 정보) 외우면 좋음 
		String user = "GDJ61";
		String password = "1111";
		
		// DriverManager 클래스로부터 Connection 객체를 받아 온다
		try { 
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		//사용이 끝난 Connection 객체는 반드시 닫아야 한다 
		try {
			if(con != null) {
				con.close();
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex03() {
		
		Connection con = null;
		BufferedReader reader = null;
		try {
			
			//프로퍼티 파일 읽는 문자 입력 스트림 생성하기
			reader = new BufferedReader(new FileReader("db.properties"));
			
			//프로퍼티 파일을 읽어서 사용자 정보 처리하기 
			
			//프로퍼티 객체 생성하기
			Properties properties = new Properties();
			properties.load(reader); //버퍼드 리더를 썼으니 로드 리더를 쓰는게 맞음
			
			
			//프로퍼티 객체에 저장된 각 Property읽기
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			
			//DriverManager로부터 Connection 객체 얻기
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB에 접속되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(con != null) {
					con.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
		
		
		
	}//이건 학습용으로 나눠 쓴거고 실제로 할땐 나눠서 하지 않아도 됨 
		
	
	public static Connection getConnection(){
		
		
		Connection con = null; 
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties properties = new Properties();
			properties.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(properties.getProperty("url")
					,properties.getProperty("user")
					,properties.getProperty("password"));
			
			
			
		} catch(Exception e) {	// ClassNotFoundException,SQLException,IOException 한번에 처리할 예정 
			e.printStackTrace();
		}//이쪽에 finally 를 안 적는건 닫는 메소드는 따로 적어야 하기 때문, 쓰지도 않고 닫았기 때문 
		
		return con;
	}// 닫힌 상태로 메소드를 받으면 어떻게 써 ?,, 못 써
	
	// 이제 getConnection만 호출하면 반복되는 connection만들기를 안해도 됨
	
	
	public static void main(String[] args) {
		Connection con = getConnection();
		System.out.println("DB에 접속되었습니다.");
		//con.close(); //만약 닫으려면 여기서 닫는것 굳이 안해도 됨(try catch를 통해서 써야함)

	}

}
