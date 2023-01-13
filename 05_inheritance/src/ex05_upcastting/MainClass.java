package ex05_upcastting;

public class MainClass {
	

	public static void main(String[] args) {
		
		//부모 타입 선언 (만드는건 부모 타입인데) 
		Person person;
		
		person = new Student();
	//아무 캐스팅도 안했지만 자동으로 부모타입은 부모타입에 자식을 자동으로 저장
		person = new Alba();
		
		person.eat();
		person.sleep();
		person.study();
		
	
	}
	
}
