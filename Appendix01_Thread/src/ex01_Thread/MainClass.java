package ex01_Thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator("영희"); //계산기에 이름 주는 것 
		//my Calc 스레드 생성 
		myCalc.start(); // start 메소드는 run 메소드를 스스로 호출
		//main은 myCalc 스레드의 동작 시작만 처리하고 동작완료까지 기다리지 않습니다 
		
		Calculator yourCalc = new Calculator("상철");
		//마찬가지 
		yourCalc.start(); // start 메소드는 run 메소드를 스스로 호출
		
		//myCalc 스레드가 yourCalc 스레드보다 먼저 실행된다는 보장이 "전혀" 없습니다
		//스레드 실행순서를 정하는건 Jvm 스스로 정함 
	System.out.println("main 메소드를 종료합니다");
	
	}
}
