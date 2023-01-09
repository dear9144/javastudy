package ex02_loop;

public class Ex01_for {

		/*
 		for문 
 			1. 연속된 숫자를 생성하는 반복문 (배열에서 주로 사용)
 			2. 형식 
 				for(초기문; 조건문; 증감문) {          증감문 : 증가하고 감소하는 
 					실행문
 			}
		*/

	
	public static void ex01() {
		
		//	1 ~ 10 연속된 숫자 만들기 연습 
		
		for(int a = 1; a <= 10; a++) {	//a++ ++a 상관 없음 a <11 가능 
			System.out.println(a);
		}
	
	}
		/*
		  for(int a = 0; a <= 9; a++) {
		  system.out.println(a + 1);도 가능 
		  
		  최종적으로 실행되는건 '실행문'이다 '증감문'이 아님 
		  1. 초기문 2. 조건문 3. 실행문 4. 증감문 1은 최초 실행 되고 나머지는 2,3,4가 반복됨	
		 */
	
	public static void ex02() {
		
		// 횟수 ex.5번만 실행해 봐라 
		int count = 5;
		
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World"); 
			/*
			  	0부터 시작하는걸 선호 
			 	int a = 0; a < 5; a++ 이렇게 써도 되지만 
			 	위와 같이 변수 count = 5; 즉, 또 다른 변수를 선언하여 조건문 안에 넣는 형식을 선호 
			 */
		}
		
	}
	
		
	public static void ex03() {
		
		// 10 ~ 1
		for(int a = 10; a >= 1; a-- ) {
			System.out.println(a);
		}
		
	}
	
	public static void ex04() {
		
		//  구구단 (2단) 
		
		/*
		 for(int a = 0; a%2 =   ; a++) {
		 System.out.println(a);
		 */
		int dan = 2; 
		for(int a = 1; a <= 9 ; a++)
			System.out.println(dan + " x " + a + " = " + (dan * a));
		{
			
			
		}
		
	}
		

	public static void main(String[] args) {
		ex04();

	}

}
