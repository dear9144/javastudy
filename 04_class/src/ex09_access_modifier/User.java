package ex09_access_modifier;

public class User {
	
	
	
	//access_modifier

	// ~~ 노션 참고 ~~

	
			//필드
			private String id;
			private String pw;
			private boolean isVip;

			//user.id = "admin";이렇게 교환할 수 있던건 2번 접근 제어 지시자가 사용됐기 때문임
			//같은 패키지를 공유
			// ~~노션 참고 ~~23-01-11		
			
			//이 친구는 admin을 전달을 해줘야 하기 때문에 반환 타입이 있음 
			//~~노션 참고 ~~ 23-01-12
			//source 로 만들면 됨 
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getPw() {
				return pw;
			}
			public void setPw(String pw) {
				this.pw = pw;
			}
			
			
			
			
		
			
			public boolean isVip() {
				return isVip;
			}
			public void setVip(boolean isVip) {
				this.isVip = isVip;
			}
			//default 접근제어 지시자를 사용 
}


