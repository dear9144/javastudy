package ex04_builder;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = User.builder()
					.id("admin")
					.pw("123456")
					.build();
		System.out.println(user);

	}

}
