package ex06_select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MainClass {
	
	
	//결과 행이 1개인 경우  
	public static void ex01() {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;//select 결과를 볼 것이다 
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, p);
			
			String sql = "SELECT MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE";
			sql += " FROM MEMBER_TBL";
			sql += " WHERE MEMBER_NO = ?"; //조회안될때를 보고자 함 
			//어지간하면 한줄로 만드는거 추천 
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 2;//db에 멤버 2가 살아있어서, 1을 넣으면 null 값이 나올 것이다 
			
			ps.setInt(1, memberNo);
			
			
			rs = ps.executeQuery(); // SELECT를 실행하는 메소드 
			//결과가 한개이기 때문에 호출을 한번만 하는 것임 여러번 한다면 그 개수만큼 호출할 것 
			
			//System.out.println(rs.next()); //첫번째 결과 행이 있으면 true, 없으면 false
			//System.out.println(rs.next()); //두번째 결과 행이 있으면 true, 없으면 false
			//현재 db의 결과가 1개가 있는 경우이기 때문에 첫번째가 true 두번째가 false가 나오는 것
			//확인용이 남아있으면 안되기 때문에 주석처리 한 것 
			
			
			//member 객체 선언 (분리 해야한다)//왜? if 문이 종료된 뒤 member 가 null 이라면 조회된 결과가 없었다는 의미가 된다
			
			Member member = null;
			
			//결과 행이 최대 1개 있으므로 if문으로 분기 처리를 하면 문제가 없다 
			
			if(rs.next()) {
				
				// 결과 행의 각 칼럼 정보 읽기 (이름으로 불러오기를 확인해볼 것) 
				member = new Member();
				member.setMember_no(rs.getInt("MEMBER_NO"));
				member.setId(rs.getString("ID"));
				member.setName(rs.getString("NAME"));
				member.setAddress(rs.getString("ADDRESS"));
				member.setJoin_date(rs.getDate("JOIN_DATE"));
				
			}//else일 경우 아무일도 안할 예정이기에 else는 만들지 않는다 
			 
			System.out.println(member); //드디어 최종적으로 select의 결과를 볼 수 있는 것 
		
			/*
			 | MEMBER_NO | 		ID 		| 		NAME 		| 	ADDRESS 	| 		JOIN_DATE		 | 최초 rs가 가리키는 위치 : 없음 
			 |		1    | 	   admin    |		관리자		| 	서울		|		23/02/15		 | <- 첫번째 rs.next() 호출한 경우 
			 |		2    | 	   master   |		운영자		| 	경기		|		23/02/16		 | 
			 																						   <- 세번째 rs.next() 호출한 경우 결과가 없으므로 false 반환 
			 
			 1. ResultSet rs 객체는 하나의 행(Row) 을 가리키는 포인터 역할이다.
			 2. next 메소드를 통해서 각 행(Row)을 (위치 정보) 가르킬 수 있다 
			 		1) next 메소드를 1번 호출하면 Select 전체 결과 중 1행을 가르킨다.
			 		2) next 메소드를 2번 호출하면 select 전체 결과 중 2행을 가르킨다.
			 3. next 메소드의 호출 결과는 boolean이다
			 		1) 조회된 결과 행이 있으면 true가 반환된다.
			 		2) 조회된 결과 행이 없으면 false가 반환 된다.
			 		RS만 있으면 아무것도 확인 할 수 없고 RS의 next 메소드로 행이 있고 없고를 판가름 한다
			 
			 4.결과 행의 칼럼 정보 가져오는 방법 
			  		1) 칼럼의 이름을 그대로 사용한다 
			  			rs.getInt("MEMBER_NO")
			  			rs.getString("ID")
			  			rs.getString("NAME")
			  			rs.getString("ADDRESS")
			  			rs.getDate("JOIN_DATE")
			  			
			  		2) 결과 행의 칼럼 순서대로 번호를 붙여서 사용 
			  			rs.getInt(1)
			  			rs.getString(2)
			  			rs.getString(3)
			  			rs.getString(4)
			  			rs.getDate(5)
			  			
			 */
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(rs != null)rs.close();
				if(ps != null)ps.close();
				if(con != null)con.close();
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
	}

	
	
	//결과 행이 2개인 경우 
	
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
			try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, p);
			
			String sql = "SELECT MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE";
			sql += " FROM MEMBER_TBL"; //전체 멤버를 조회하겠다 
			
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery(); // SELECT를 실행하는 메소드 
			
			//결과 행이 여러개 있으므로 ArrayList를 준비한다 
			List<Member> memberList = new ArrayList<Member>();
		
			//결과 행이 여러개 있으므로 while 문으로 반복 처리 
			
			
			while(rs.next()) {
				
				// 결과 행의 각 칼럼 정보 읽기 (이름으로 불러오기를 확인해볼 것) 
				/*Member member = new Member();
				member.setMember_no(rs.getInt("MEMBER_NO"));
				member.setId(rs.getString("ID"));
				member.setName(rs.getString("NAME"));
				member.setAddress(rs.getString("ADDRESS"));
				member.setJoin_date(rs.getDate("JOIN_DATE"));
				*/
				
				Member member = new Member();
				member.setMember_no(rs.getInt(1));
				member.setId(rs.getString(2));
				member.setName(rs.getString(3));
				member.setAddress(rs.getString(4));
				member.setJoin_date(rs.getDate(5));
				
				//member 객체를 ArrayList 에 저장하기
				//계속해서 결과를 누적하겠다는 것 
				memberList.add(member);
			}
			
			//while문이 종료된 뒤 ArrayList의 size가 0 이라면 조회된 결과가 없었다
			for(int i = 0; i< memberList.size(); i++) {
				System.out.println(memberList.get(i)); //get : ArrayList 한개씩 읽어 오겠다 
			}
			
			
		
			/*
			 | MEMBER_NO | 		ID 		| 		NAME 		| 	ADDRESS 	| 		JOIN_DATE		 | 최초 rs가 가리키는 위치 : 없음 
			 |		1    | 	   admin    |		관리자		| 	서울		|		23/02/15		 | <- 첫번째 rs.next() 호출한 경우 
			 |		2    | 	   master   |		운영자		| 	경기		|		23/02/16		 | 
			 																						   <- 세번째 rs.next() 호출한 경우 결과가 없으므로 false 반환 
			 
			 1. ResultSet rs 객체는 하나의 행(Row) 을 가리키는 포인터 역할이다.
			 2. next 메소드를 통해서 각 행(Row)을 (위치 정보) 가르킬 수 있다 
			 		1) next 메소드를 1번 호출하면 Select 전체 결과 중 1행을 가르킨다.
			 		2) next 메소드를 2번 호출하면 select 전체 결과 중 2행을 가르킨다.
			 3. next 메소드의 호출 결과는 boolean이다
			 		1) 조회된 결과 행이 있으면 true가 반환된다.
			 		2) 조회된 결과 행이 없으면 false가 반환 된다.
			 		RS만 있으면 아무것도 확인 할 수 없고 RS의 next 메소드로 행이 있고 없고를 판가름 한다
			 
			 4.결과 행의 칼럼 정보 가져오는 방법 
			  		1) 칼럼의 이름을 그대로 사용한다 
			  			rs.getInt("MEMBER_NO")
			  			rs.getString("ID")
			  			rs.getString("NAME")
			  			rs.getString("ADDRESS")
			  			rs.getDate("JOIN_DATE")
			  			
			  		2) 결과 행의 칼럼 순서대로 번호를 붙여서 사용 
			  			rs.getInt(1)
			  			rs.getString(2)
			  			rs.getString(3)
			  			rs.getString(4)
			  			rs.getDate(5)
			  			
			 */
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(rs != null)rs.close();
				if(ps != null)ps.close();
				if(con != null)con.close();
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		ex02();

	}

}
