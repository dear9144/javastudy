package ex03_constructor;

public class Person {
	
	public Person() {
		//생성자
		System.out.println("Person 생성");
			
		//default 생성자 
		
		
	}
	/*****************************************/
	//필드
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}



