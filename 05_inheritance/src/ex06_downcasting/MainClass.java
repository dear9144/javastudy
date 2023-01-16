package ex06_downcasting;

public class MainClass {	
	Person person = new Student();

public static void ex02() {
	
//person
Person person = new Person();


//잘못된 캐스팅
Student student = (Student)person;
//다운 캐스팅이 안되는걸 볼 수 있음

//잘못된 캐스팅은 컴파일 오류로 걸러지지 않는다.
student.eat();
student.sleep();
student.study();//오류 발생 부분


}


public static void ex03() {
	//Person
	Person person = new Person();
	
	// Student 객체가(인스턴스,instance) 맞다면  Student 타입으로 캐스팅
	if(person instanceof Student) {
		
		Student student = (Student)person;
		student.eat();
		student.sleep();
		student.study();
		
		person.eat();
		person.sleep();
		((Student)person).study();
		
		((Student) person).study();
	}
	
}
	public static void main(String[] args) {
	
	ex03();

}
}
