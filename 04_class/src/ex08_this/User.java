package ex08_this;

public class User {
	
	
			//this
			//노션 참고 
	
	
		//메소드
	
		//필드
		String id;//this.id
		String pw;//this.pw
		//생성자
		User(String id, String pw) {
			this.id = id;
			this.pw = pw;
		}
		void printThis() {
			System.out.println(this);
			
		}
			//4. 내부에서 부름 
		
		
		void info() {
			System.out.println("아이디 : " + id);  //this.id 로 해도 되지만 안 붙임 정해진 메소드에서만 가능함 
			System.out.println("비밀번호 :" + pw);
			
		}
}
