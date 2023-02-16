package ex06_select;

import java.sql.Date;

public class Member {
	
	//필드는 테이블의 칼럼과 1:1로 매칭한다 
	private int member_no;//회원이 21억이 넘어갈 것 같으면 long , 안 넘어갈 것 같으면 int
	private String id;
	private String Name;
	private String address;
	private Date join_date;//date 의 임폴트는 java.sql로 임폴트 할 것 

	
	//디폴트 타입의 생성자 암것도 안함
	public Member() { }

	//생성자
	public Member(int member_no, String id, String name, String address, Date join_date) {
		super();
		this.member_no = member_no;
		this.id = id;
		Name = name;
		this.address = address;
		this.join_date = join_date;
	}
	
	
	//게터세터

	@Override
	public String toString() {
		return "Member [member_no=" + member_no + ", id=" + id + ", Name=" + Name + ", address=" + address
				+ ", join_date=" + join_date + "]";
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
	
	
	
	
	
	
}
