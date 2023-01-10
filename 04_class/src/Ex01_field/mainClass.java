package Ex01_field;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// User 타입의 객체 선언 (배열과 비슷) 
		// 클래스의 이름이 type이 됨 (double int같이)
			User user1; //선언 완료 
		
			
		
		// User 타입의 객체 생성 ;해당 클래스 객체 만듬
			user1 = new User();
			
			//객체 user1의 필드 활용 
			user1.id = "admin";
			user1.pw = "123456";
			user1.point = 100;
			user1.isVip = false;
			// addr은 postcode로 쪼개
			//postcode
			//user1의 addr 필드 생성(Address 클래스 타입이기 댸문에 반드시 new를 이용해 생성해야 함 
			// String 과 같은 타입과는 다르기 때문 
			//NullPiintExeption = null 값 없음 
			
			user1.addr = new Address();
			user1.addr.postcode = "12345"; 
			user1.addr.roadAddress = "가산동"; 
			user1.addr.jibunAddress = "철산동"; 
			
			
			System.out.println("아이디 : " + user1.id );
			System.out.println("비밀번호 : " + user1.pw );
			System.out.println("포인트 : " + user1.point );
			System.out.println("VIP 여부 : " + user1.isVip );
			System.out.println("주소 : " + user1.addr.postcode + " " + user1.addr.roadAddress + "(" + user1.addr.jibunAddress + ")" );
			
			
			//개별 생성
			// 다음 값으 ㄹ가지는 객체 user2를 생성해 보세요
			/* 아이디 : master
			 * 비밀번호 : 654321
			 * 포인트 : 1000
			 * VIP 여부 : true
			 * 주소 : 54321 디지털로 (철산동)
			 */
			User user2;
			user2 = new User();
			user2.id = "master";
			user2.pw = "654321";
			user2.point = 1000;
			user2.isVip = true;
			
			user2.addr = new Address();
			user2.addr.postcode = "54321";
			user2.addr.roadAddress =  "디지털로";
			user2.addr.jibunAddress = "철산동";
			
			
			
			System.out.println("아이디 : " + user2.id);
			System.out.println("패스워드 : " + user2.pw);
			System.out.println("포인트 : " + user2.point);
			System.out.println("is VIP : " + user2.isVip);
			System.out.println("주소 : " + user2.addr.postcode + " " + user2.addr.roadAddress + "(" + user2.addr.jibunAddress + ")") ;
			
			
			//객체 선언 + 생성 강사님 코드 추가적으로  참고할 것
			
			
			
 			
	}

}
