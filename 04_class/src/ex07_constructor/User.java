package ex07_constructor;

public class User {
			
	
			//필드가 두개 
			String id;
			String pw;
			
			//생성자
			User() {
				id = "anonymous";
				pw = "1234";
			}
			
			//생성자 2
			User(String userId,String userPw) {
			id = userId;
				pw = userPw;
			}
			/*
			 
			 id를 왜 userid로 바꾸고 pw 를 userPw라고 바꾼것인가?
			 필드 이름하고 매개변수 이름이 같아지는데 
			 그렇게 되면 동작이 안됨
			 
			 */
			
			
			
			 
			//메소드
			
			void info() {
				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				
				
			}
}
