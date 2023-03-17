package ex04_update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) {
		
		// id가 admin인 회원이 작성한 게시글의 TITLE 앞에 "[New]"를 추가하시오 
			
		Connection con = null;
		PreparedStatement ps = null;
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "UPDATE BOARD_TBL SET TITLE = '[New]' || TITLE";
			sql += " WHERE MEMBER_NO = (SELECT MEMBER_NO FROM MEMBER_TBL WHERE ID = ?)"; // 이때 ?는 변수를 쓸 것입니다의 의미 
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
		
	}
