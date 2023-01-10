package Ex03_method;

public class Calculator {
	
	// 메소드 (함수)
	// 계산기 기능을 만든다고 생각 
	
	/*
	 메소드의 형식이 어떻게 되는가 
	 (아무이름이나 써도 상관없음, 메인 메소드는 정해져있 MainClass //addition을 호출하면 무조건 double type
	 							
	 반환타입(double) 메소드명(매개변수) {
		 메소드 본문
		 return 반환값
		 }
		 
		 
		 
		 1. 반환값 + 반환타입 
		 	메소드 실행(메소드 호출)의 결과 
		 2. 메소드명 
		    개발자 마음대로 정함
		 3. 매개변수
		 	메소드로 전달되는 값(인수,argument)을 저장하는 변수 
		 	ex. MainClass의 1.5 ,2.5를 말함 - argument 
		 	argument를 저장하는 변수를 매개변수 
		 	
	 		이 부분을 공부 
	 */ 
	
	/*
	 	메소드의 4가지 형식 													메소드 호출 
	 	
	 	1. 반환값 x , 인수 x													method();
	 	반환값도 없고 인수값도 없음												~ void ex01() {}
	 	~ void - 반환이 없다  Main method는 반환 타입이 없음 ~											
	 																			ex01(); 
	 																			메소드 호출 등 예제 쓸때 엄청 많이 썼음
	 	void method() {
	 	메소드 본문
	 	}
	 	  즉, return 부문이 없음
	 	  
	 	  
	 	
	 	2. 반환값 x 인수(전달되는값) o											int a = 0;
	 	void method(이름이라고 보면 됨 )(int arg) {								method(a);
	 		메소드 본문
	 	}
	 	
	 	3. 반환값 o 인수 x
	 		int method() {														int result;
	 		메소드 본문															result = mothod()
	 		return 반환값
	 		}
	 		
	 		반환값은 int type
	 		
	 	4. 반환값 o , 인수 o
	 		int method(int arg) {												int a = 0;
	 		메소드 본문															int result;
	 		return 반환값														result = method(a);
	 		}																	~ a를 주고 result를 받아온다~
	 		
	 		
 */
	
	double addition(double a, double b) { //이건 메소드 정의 (MainClass)가보면 메소드 호출 
		return a + b; 
	}
		
		//a와 b를 더한게 결과임 그 결과가 double type이다 
		//에디션 메소드로 각 매개변수 두개가 전달되면 전달된 두개를 더해서 돌려줘라 
		//ex. double a = 1.5 , double b= 2.5 return 값 : 4.0
	
		double subtraction(double a, double b) {
			return a - b;
		
	}

	
	
	
	
	
		
}
