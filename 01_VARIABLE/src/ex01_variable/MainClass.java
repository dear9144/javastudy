package ex01_variable;

public class MainClass {

	//single comment 
	/*
	 안녕하세요 
	 */
	
	//1. 프로젝트 : 상관없음 (대문자 소문자
	//2. 패키지 : 소문자로 
	//- 실무시 회사 도메인과 앱 이름으로 작성 (ex. com.samsung.galaxy)
	//3. 클래스 : 첫글자 대문자 카멜 케이스 방식(upper camel case 방식)
	//첫 글자가 대문자이다
	//: 첫번째 글자가 대문자다 - 클래스다
	//4. 메인 메소드 : 
	//첫 글자만 대문자로 작성하고 나머지는 소문자 lower camel case(첫 글자가 소문자이다) 방식 
	//Hello World(upper) 
	//hello World(lower)
	//5. 변수 (variable)
	//첫 글자만 대문자로 작성하고 나머지는 소문자 lower camel case(첫 글자가 소문자이다) 방식
	//메소드 = 변수 같은 규칙 사용
	//6. 상수 :
	//항상 같은 값을 가지는 변수 (안 변함) ex. 파이
	//모두 대문자로 작성 
	//HELLOWORLD - 이렇게 작성시 가독성이 덜어지기 떄문에
	//HELLO_WORLD - 언더바를 사용해서 가독성을 높여  (SNAKE CASE방식)

	//어퍼,  로우 ,스네이크 : 이름 규칙
	//셋중에 하나인지만 프론트는 자유로운 편 

	
 
    
	
	
	
	//타입 구분 
	// 1. primitive type : 기본타입 : 소문자로 되어 있음 , 값을 저장하는 타입 
	// 2. reference type : 참조타입 : 첫글자 대문자 - 클래스 (값이 저장된 참조값): 모든 클래스는 참조타입이다 (싹 다)
	// 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isGood = true;
		boolean isAlive = false;
		boolean isHappy = true;
		System.out.println(isGood);
		System.out.println(isAlive);
		System.out.println(isHappy);
		
		char ch1 = 'A';
		char ch2 = '홍';
		char ch3 = '\n';
		char ch4 = '\t';
		
		System.out.println(ch1);		
		System.out.println(ch2);		
		System.out.println(ch3);		
		System.out.println(ch4);		
		
		
		int age = 46; 
		long money = 100000000L;
		
		System.out.println(age);
		System.out.println(money);
		System.out.println(Integer.MAX_VALUE);
		
		//실수타입
		double leftEye = 0.1;
		double rightEye = 0.3;
		
		System.out.println(leftEye);
		System.out.println(rightEye);
		
		//문자열타입 (여러글자 의미, 글자 수 제한이 없음, 글자가 없는 것도 저장 가능)
		String name = "신의정";
		System.out.println(name);
				
		String Country = new String("KOREA"); // 대부분의 참조 타입 사용법 나중에 스트링과 정확한 차이점 알려주실 것 ,
		
		System.out.println(Country);
		
		// 지우는 방법 ctrl d
		
		
		//6. 상수 선언하기 (final 키워드가 필요)
		
		// 모두 다 대문자 선언하고 앞에 final 선언
		final double PI = 3.141592;
		System.out.println(PI);

		
	
	
	}
	    
}

