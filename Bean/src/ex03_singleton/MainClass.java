package ex03_singleton;

public class MainClass {

	public static void main(String[] args) {
		//User 클래스 파일을 다 마무리 하고 단계 -User 객체를 못 만드니까 가져올 것
		//getInstance를 이용해서 return해서 가져올 수 있음 
		//
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		//user1, user2같은 유저일까?
		
		System.out.println(user1 == user2);
		
		//true = 참조값이 같다. 즉 물리적으로 같다. 

	}

}
