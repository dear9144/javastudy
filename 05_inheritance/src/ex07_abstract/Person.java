package ex07_abstract;

public abstract class Person {
	
	
	//default 메소드(본문이 있는 메소드)
	public void eat() {
		System.out.println("먹는다.");
	}

	
	public void sleep() {
	 System.out.println("잔다.");
	 
	
}	// 추상 메소드 (본문이 없는 메소
 	public abstract void study(); 
	
	
	
	
	//public void 
	
	//본문이 없는 메소드 : "추상 메소드" 라고 부름
}
