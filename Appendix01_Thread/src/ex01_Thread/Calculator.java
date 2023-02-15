package ex01_Thread;

/*
 * 
 * runnable 인터페이스를 구현하는 방법 
  
 	1. implements runnable 처리한다
 	2 . Runnable 인터페이스의 public abstract void run(); 추상메소드를 오버라이드 한다 
 	3. Runnable 객체를 만들고 Runnable 객체를 이용해서 thread 객체를 만든다 
 	4. 스레드 객체가 가진 run 메소드는 start 메소드로 호출한다 
 */

public class Calculator extends Thread {
	
	/*
	 스레드
	 1. JAVA 가 실행하는 작업의 세부 단위이다 
	 	기본 단위 : main 메소드(main 스레드) - single Thread환경(스레드가 1개인) 
	 2. 스레드는 main메소드와 별개로 실행되는 독단적인 작업을 만들때 사용한다.
	 3. 스레드를 만드는 방법 
	  	1) 스레드 클래스를 상속한다 
	  	2) Runnable 인터페이스를 구현 
	 */
	
	
	private String name;
	
	public Calculator(String name) {
		this.name = name;
		
	}
	
	@Override
	public void run() {
		
		System.out.println(name + "계산기가 계산합니다.");
		//0부터 n사이에 모든 정수를 더하기
		
		long n = 2000000000;
		long result = 0;
		for(int i = 1; i<=n; i++) {
			result += i; //result +=1; result += 2;,,, result += n;
		}
		System.out.println(n + "까지 더한 값은 " + result + "입니다.");
		
		
	}

}
