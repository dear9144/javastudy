package ex08_interface;

public interface Person {
	
	
	//default 메소드(본문이 있는 메소드)
	public default void eat() {
		System.out.println("먹는다.");
	}

	
	public default void sleep() {
	 System.out.println("잔다.");
	 
	
}	// 추상 메소드 (본문이 없는 메소
 	public void study();
	
	
	
	
	//public void 
	
	//본문이 없는 메소드 : "추상 메소드" 라고 부름
}
