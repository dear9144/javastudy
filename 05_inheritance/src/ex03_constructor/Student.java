package ex03_constructor;

public class Student extends Person {

	//
	public Student() {
		super(); 
		System.out.println("Student 생성");
	}
	
	/**********************************************/
	
	//필드
	
	private String school;
	
	//생성자
	
	public Student(String name, String school) {
		super(name);
		this.school = school;
	}
	//메소드
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
	
}
