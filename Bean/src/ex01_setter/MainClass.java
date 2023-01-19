package ex01_setter;



public class MainClass {

	public static void main(String[] args) {
		//User 객체 (bean)생성 
		
		User user = new User();
		
		//setter이용해 필드 값 저장
		user.setId("admin");
		user.setPw("123456");
		
		//필드 값 확인 
		System.out.println(user);

		
	}

}
