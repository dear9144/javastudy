package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MemberSeqMainClass {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); //컴퓨터를 재부팅하지 않는이상 한번 실행하면 실행되는 중임
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "CREATE SEQUENCE MEMBER_SEQ NOCACHE";
		
			ps = con.prepareStatement(sql);
			ps.execute(); //성공시와 실패 처리까지 한다면 if를 동원해서 execute값을 조건으로 두고 하면 됨
			if(ps.execute()) {
				System.out.println("성공");		
			}else {
				System.out.println("실패");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
		}
		}

	}

}
