package ex09_access_modifier;

public class User {
	
	
	
	//access_modifier

	// ~~ 노션 참고 ~~

	
			//필드
			private String id;
			private String pw;
			//default 접근제어 지시자를 사용 
			//user.id = "admin";이렇게 교환할 수 있던건 2번 접근 제어 지시자가 사용됐기 때문임
			//같은 패키지를 공유
			// ~~노션 참고 ~~
			
			
			//메소드
			public void setId(String id) {
				this.id = id;
				
			}
			
			public void setPw(String pw) {
				this.pw = pw;
				
			}
			
			//이 친구는 admin을 전달을 해줘야 하기 때문에 반환 타입이 있음 
			public String getId() {
				return id;
				
			}
			public String getPw() {
				return pw;
			}
			
}
