package ex03_singleton;

public class User {
	
	//static 필드로 미리 User를 만들어 둠 
	//원래는 메인에서 뉴 유저로 만들어서 사용하는데 그걸 미리 해두는 것
	//static은 한개 만들어서 공유하는 것이라 singleton 사용시 제공하는게 좋음 
	
	private static User user = new User();
	
	// private 생성자 ,외부에서는 생성자를 호출할 수 없다 = 즉 mainclass에서 만들지 못한다 
	
	private User() {
			
	}
	//위의 User를 하나만 만들고 쓸건데  어떻게 가져다 쓰는지 ??
	
	//static 메소드 사용 , 왜 사용하는가? static 필드를 사용하기 위해서  (static은 static끼리 사용가능하기에)
	// + 만들어지는 시기가 다르기 때문에 
	//user 필드를 외부에서 사용할 수 있도록 반환하는 일종의 getter를 만드는 것 
	
	public static User getInstance() {
		
		return user;
		
		//위와 같은 경우가 date_time 에 calendar part에 있음 
		
		//singletone은 얼마나 필요할까? 매우 많이 ㅎ 
		
	}
	
	
	
	
	
	
	

}
