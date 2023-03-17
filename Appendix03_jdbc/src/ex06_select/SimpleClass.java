package ex06_select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SimpleClass {
	
	
	// 단일행 SELECT문
	public static void ex01() {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@loacalhost:1521:xe";
			con = DriverManager.getConnection(url,p);
			
			String sql = "SELECT MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE FROM MEMBER_TBL WHERE MEMBER_N0 = ?";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 1;
			
			ps.setInt(1, memberNo);
			
			rs = ps.executeQuery();
			
			
			Member member = null;
			
			if(rs.next()) {
				member = new Member();
				member.setMember_no
				
				
			}
			
			
			
			
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		

	}

}
