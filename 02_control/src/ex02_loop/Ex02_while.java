package ex02_loop;

public class Ex02_while {
				
	
			/*
			  while문
			  초기문 , 증감문이 없음 - 조건문만 있음
			   1. 특정 조건을 만족하면 반복하는 반복문 
			   	  어딘가 들어가 있는 데이터를 꺼낼 때 씀
			   2. 형식 (자세한 경로는 차후 배움)
			   		while(조건문) {  
			   			실행문
			   		}
			   		
			   		
			 */
			
	
	public static void ex01() {
		// 1 ~ 10 , 보편적으로 for문으로 짜야 하는 예시임 for -> while
		int a = 1;
		while(a <= 10) {
			System.out.println(a);
			a++;
		}
		
	}
	
	
	public static void ex02 () {
		 
		int account = 85000;
		int money = 550; //출금 금액
		int n = 0; //출금 횟수
		while(account >= money) {
			System.out.print(++n + "번째 출금 결과 : "); //n++ 시 0이 도출되니 쓰지 않음
			account -= money;
			System.out.println(" 계좌: " + account + "원");
			
		}
		
	}
	public static void main(String[] args) {
		ex02();
		
		
		

	}

}
