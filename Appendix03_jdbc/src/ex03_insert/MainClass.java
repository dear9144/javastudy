package ex03_insert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {
	
	//상수 삽입 
		public static void ex01() {
			
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				
				Properties p = new Properties();
				p.load(new BufferedReader(new FileReader("db.properties")));
				
				String url = p.getProperty("url");
				String user = p.getProperty("user");
				String password = p.getProperty("password");
				
				con = DriverManager.getConnection(url, user, password);
				
				
				String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
				sql += " VALUES(MEMBER_SEQ.NEXTVAL, 'admin', '관리자', '서울', TO_DATE('2023-02-15', 'YYYY-MM-DD'))";
				//한개 이상만 띄어쓰기 하면 됨 
				
				ps = con.prepareStatement(sql); // 모든 jdbc의 공통 코드이다 
				
				int insResult = ps.executeUpdate(); // 이 역시 preparestatement로 사용 할것임
				
				System.out.println(insResult + "개의 행이 삽입되었습니다.");
				// 몇개의 행이 삽입됬는지 알려주는 것 
				
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}finally {
				try {
					if(ps != null ) ps.close(); //닫는건 먼저 만든 것의 역순이다. 
					if(con != null) con.close();
				} catch (Exception e) {
					e.printStackTrace();// TODO: handle exception
				}
			}
			
			
			
		}
	
	//변수 삽입 - 중요 
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)"; // 이때 ?는 변수를 쓸 것입니다의 의미 
			
			ps = con.prepareStatement(sql);
			
			String id = "master";
			String name = "운영자";
			String address = "경기";
			
			ps.setString(1, id); //1번째 ?자리에 id를 넣으시오 
			ps.setString(2, name);
			ps.setString(3, address);
			
			int insResult = ps.executeUpdate();
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) ps.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	// 이 역시 한번만 할 수 있는 코드 
	
	//
	public static void ex03() {
		Connection con = null;
		PreparedStatement ps = null;
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "UPDATE BOARD_TBL SET TITLE = '[New]' || TITLE";
			sql += " WHERE MEMBER_NO = (SELECT MEMBER_NO FROM MEMBER_TBL WHERE ID = ?)"; 
			// 이때 ?는 변수를 쓸 것입니다의 의미 
			//보드 테이블엔 ID 가 없어서 방법이 없음 서브쿼리로 하는 수밖에
			// 단일행 서브쿼리임 (UNIQUE , PK 둘중 하나이기 때문에)
			// 그렇기에 단일행 연산자인 (=) 가 들어간 것임 
			ps = con.prepareStatement(sql);
			
			String id = "admin"; //master일땐 어떻게 될까? 0행이 return이 됨 
			ps.setString(1, id);
			
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null)ps.close();
				if(con != null)con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
		
	}
	
	public static void main(String[] args) {
		
		ex03();
	}

}
