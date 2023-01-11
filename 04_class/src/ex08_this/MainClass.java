package ex08_this;

public class MainClass {
	
	

	public static void main(String[] args) {
		
		// 1. User 객체 생성
		User user = new User("admin","123456");
		
		
		
		// 2.User 객체에 저장된 값은 무엇일까? user 객체의 참조값이다. (정확히는 다른 값도 포함) 
		System.out.println(user);
		
		// 3. user 객체의 this값 확인 
		user.printThis();
		
		//4. 외부에서 부름
		
		// user 객체의 필드값 확인
		user.info();
		
		
	}

}
