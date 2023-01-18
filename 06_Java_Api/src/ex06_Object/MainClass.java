package ex06_Object;

public class MainClass {
	
	public static void ex01() {
		
		Object person = new Person();
		
		if(person instanceof Person) {
			((Person)person).eat();
			((Person)person).sleep();
			
			
			
		}
	}
	public static void ex02() {
		
	// name이 같으면 같은 Person 으로 처리하기로 한 시스템
		Person person1 = new Person("홍길동");
		Person person2 = new Person("홍길동");
		
		if(person1.equals(person2)) {
			System.out.println("같은 Person이다.");
		}else {
			System.out.println("다른 Person이다.");
		}
		
	}
	public static void ex03() {
		Person person = new Person("홍길동") ;
		System.out.println(person);
		System.out.println(person.toString());//펄슨을 문자열로 바꿔 호출해주세요
		
	//이 String은 Object가 가지고 있는 toString
	}
	public static void main(String[] args) {
		ex03();
	}

}
