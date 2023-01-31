package b;

public class Seat {
	
	private String name;			//필드 , 필드는 null로 초기화 돼 있음 ,이름이 없는 상태 
	
	public Seat() {} //new Seat() 좌석이 안 정해져 있으면 이걸로, new Seat()  + setName("홍길동")을 써줘야 함 

	
	public Seat(String name) { //new Seat("홍길동") 좌석이 정해져있으면 이걸로
		this.name = name;
	}
	

	//이름을 넣어주는 방법 getter setter
	public String getName() { //불러오려고 , 이름 확인용 메소드니까 (예약자 확인용으로 쓰면 될듯)
		return name;
	}
	public void setName(String name) { //불러와서 바꾸려고 왜? private로 정보를 은닉하고 
		//은닉된 정보의 확인  getName(
		//은닉된 정보 수정 setName
		// 실제 name 저장용 메소드
		this.name = name;
	}
	public void reserve(String name) { //예약 처리할 때 보여줄 메소드 : reserve("홍길동") 을 호출하면 setName("홍길동")이 다시 호출돼서 처리된다.
		setName(name);
		//1. 예약name을 맞추려고 ,2. reserve를 살리기 위해 사용 
	}
	//이 좌석을 누가 차지했니? 안했니?
	public boolean isOccupied() { //좌석을 점유되었으면 true 점유되지 않았으면 false
		if(name == null) {
			return false; //점유 되어 있지 않다
		}else {
			return true;//추천하는 코드 : return name != null; 리턴하는 네임이 아니면 null이다 
		}
	}
	public boolean isMatched(String name) { //그사람 좌석이 맞다 아니다 String name을 쓴 이유는 이름을 받아와야 하기 대문에
		//좌석의 name과(필드 : this.name) 매개변수 String name과 동일하면 됨
		if(this.name.equals(name)) {
			return true;
		}else {
			 //추천하는 코드 return this.name.equals(name);
			return false;
		}
		
	}

}
	


