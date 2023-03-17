package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ContactDTO;

/*
     dao
     1. Database Access Object
     2. Database에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받아온다
     	다오에서 쿼리문 실행하고 jdbc 코드는 다오가 받아옴 (jdbc코드가 다오 안에 다 있음)
     3. 여러 객체가 만들어 지지 않도록  singleton 패턴으로 생성
 */

public class ContactDAO2 {
	// singletone 
	//디폴트 형태의 생성자 만듬 - public으로 하지 않는다 
	private static ContactDAO dao = new ContactDAO();
	private ContactDAO2() { } // 이때 다오 내부에서는 호출이 가능하다 외부가 안될뿐
	public static ContactDAO getInstance() {
		return dao;
		
	}
	
	/***************2. field *****************/
	//필드 선언 - 변수
	// ContactDAO 클래스의 메소드들이 공통으로 사용할 요소를 선언한다 
	private Connection con; //어제와는 다르게 일단 필드에 한번 선언해 놓고 가져다 쓰는것 
	//db접속
	private PreparedStatement ps; //쿼리문 실행
	private ResultSet rs;// select 결과 처리
	private String sql;//쿼리문 자체 
	private int res; //insert,delete,update 결과 
	
	
	/***************3. method*******************/
	
	// CRUD : (insert)create, update ,(select)read, delete - db의 기본 작업이다 
	// CRUD 메소드의 진행 순서 : Connection 얻기 -> CRUD 작업 -> 사용한 작업 반납 
	
	
	// 공통 메소드 -1(Connection 얻기)
	private Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(p.getProperty("url"), p);
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		return con;
	}
	
	// 공통 메소드 -2( 사용한 자원 반납)
	private void close() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		
	}

	
	
	// CRUD 메소드 -1 (연락처 추가하기) 
	// 다오는 insert 결과를 (int)를 가지고 있지 않고 넘겨주는 역할을 할거다
	// 연락처 받고 넘겨주는 역할 (다오 안에서 많은걸 처리하지 않음)
	// 1. 반환값 : 0(실패) 또는 1 (성공)
	// 2. 매개변수 : ContactDTO contact 객체에는 연락처 정보(name, tel, email, address)가 모두 저장되어 있다 
	
	public int insertContact(ContactDTO contact) {
		 
		//1. connection 얻기
		try {
			
			con = getConnection(); //field 선언 connection
			
			sql = "INSERT INTO CONTACT_TBL(CONTACT_NO, NAME, TEL, EMAIL, ADDRESS) VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?, ?)";
			
			
			ps = con.prepareStatement(sql);
			
			
			ps.setString(1, contact.getName());// 1번의 name을 가져와주세요 (name은 contact에 들어있으니 contact의 getname해주세요 사용)
			ps.setString(2, contact.getTel());
			ps.setString(3, contact.getEmail());
			ps.setString(4, contact.getAddress());
			
			res = ps.executeUpdate(); //이게 어제의 rs 결과 이렇게 받겠따 
			
			
			
		
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			close(); // 클로즈 메소드 아까 만들었으니 호출만 했으니 불러온 것임 
		}
		return res;
	}//이제 insert는 잘 실행이 될 것이다 

	
	// CRUD 메소드 -2 (연락처 삭제하기)
	// 1. 반환값 : 0(실패) 또는 1(성공)
	// 2. 매개변수 : int contact_no 변수에는 삭제할 연락처의 고유 번호가 저장되어 있다 
	
	public int deleteContact(int contact_no) {
		
		try {
			
			con = getConnection();
			sql = "DELETE FROM CONTACT_TBL WHERE CONTACT_NO = ?";
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, contact_no);
			res = ps.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			close();
		}
		
		return res;
	}//삭제 다오 완성 
	
	//CRUD 메소드 -3 (이름을 이용한 연락처 조회하기)
	//1. 반환값 (무엇이 반환값으로 존재해야 하는가) : ArrayList 
	// 	 List<ContactDTO> 
	//2. 매개변수 : String name 변수에는 조회할 연락처의 이름이 저장되어 있다 
	public List<ContactDTO> slectContactsByName(String name) {
		
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		
		try {
			
			con = getConnection();
			sql += "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS";
			sql += "  FROM CONTACT_TBL";
			sql += " WHERE NAME = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				// rs 객체는 행 단위로 처리한다
				ContactDTO contact = new ContactDTO();
				contact.setContact_no(rs.getInt("CONTACT_NO"));
				contact.setName(rs.getString("NAME"));
				contact.setTel(rs.getString("TEL"));
				contact.setEmail(rs.getString("EMAIL"));
				contact.setAddress(rs.getString("ADDRESS"));
				
				contactList.add(contact);
				
				
			}
			
			
			//CRUD 메소드 -4 (연락처 수정하기)
			//1. 반환값 : 0(실패) 또는 1(성공)
			//2. 매개변수 : ContactDTO contact 객체에는 연락처 정보(name, tel ,email, address)
			public int updateContact(ContactDTO contact) {
				
				try {
					
					con = getConnection();
					sql = "UPDATE CONTACT_TBL";
					sql += "  SET NAME = ?, TEL = ?, EMAIL = ?, ADDRESS = ?"
					sql += " WHERE CONTACT_NO = ?"; //번호를 통해서 조회를 할 예정 
					//만약 NAME이 없으면 수정이 안되는 걸로
					ps = con.prepareStatement(sql);
					ps.setString(1, contact.getName());
					ps.setString(2, contact.getTel());
					ps.setString(3, contact.getEmail());
					ps.setString(4, contact.getAddress());
					ps.setInt(5, contact.getContact_no());
					
					res = ps.executeUpdate();
					
				}catch (Exception e) {
					e.printStackTrace();// TODO: handle exception
				}finally {
					close();
				}
				
				
				
			}
			
			
			
			public int updateContact(ContactDTO contact) {
				//1. 반환값   : 연락처 no는 1개이기 때문에 ContactDTO
				//2. 매개변수 : int contact_no 변수에는 조회할 연락처의 고유 번호가 저장되어 있다
			public ContactDTO selectContactByNo(int contact_no) {
				
				ContactDTO contact = null;
				
				try {
					
					con = getConnection();
					sql = "SELECT CONTACT_NO, NAME, TEL, EMAIL, ADDRESS";
					sql += "  FROM CONTACT_TBL";
					sql += " WHERE CONTACT_NO = ?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, contact_no);
					rs = ps.excuteQuery();
					
					if(rs.next()) {
						contact = new ContactDTO(); //결과가 이때니까 이제 만드는 것 
						contact.setContact_no(contact_no);
						contact.setName(rs.getString(2) );
						contact.setTel(rs.getString(3) );
						contact.setEmail(rs.getString(4) );
						contact.setAddress(rs.getString(5) );
						
						
					}
				}catch (Exception e) {
					e.printStackTrace();// TODO: handle exception
				}finally {
					close();
				}
				
				return contact; 
				
				
			}
				
				
			}
	
	

