package ex04_op_number;

public class MainClass {
	// ex_01 method를 만드는 것 = 메소드를 정의한다 : 기능을 1개 만든다
	
	// 메소드를 사용하는거 : 호출 
	
	//ex 01 메소드 정의 
	public static void ex01() {
		int a = 5;
		int b = 2;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;  //나눗셈 몫을 계산
		int mod = a % b; //나머지

		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
		
	}	
		
		//메인 메소드를 제외 메소드는 개발자가 만든다 
		// 만드는 위치는 상관이 없다.
	
	public static void ex02() {
		int a = 5;
		int b = 2;
		
		double div = (double)a / b;  
		
		System.out.println(div);
		
	}
		
		//ex 03 메소드 정의
	public static void ex03() {
		
		int second = 90;
		
		int min = second / 60; //1
		int sec = second % 60; //30
		
		System.out.println(min);
		System.out.println(sec);
		
		
	}
	
	
	
	public static void ex04() {
		//1 증가 : ++
		//1 감소 : --
		//전위 연산 (pre operator)
		//++a 또는 --a
		//변수 a의 값을 1증가 (감소)시킨 뒤에 사용하십시오.
		
		int a = 10;
		System.out.println(++a);
		
		//후위 연산(post operator)
		//b++ 또는 b--
		// 변수 b의 값을 사용한 뒤에 1증가 (감소)시키시오.
		
		int b =10;
		System.out.println(b++);
		//10에 1을 더하기 전에 출력을 하라 so, 10이 나옴
		System.out.println(b);
	
	}
	
		//ex05 메소드 정의
	
	public static void ex05() {

		
		
		//대입 연산
		//등호 (=) 오른쪽 값을 왼쪽으로 보내는 연산
		
		int a;
		a = 10;
		//10 = a; 는 안됨 
		System.out.println(a);
		
		
	}
	
	public static void ex06() {
		
		int x = 10;
		int y = 20;
		
		//x 와 y의 값을 교환하라 
		// y= x 는 안되니까 백업을 해야함 
		// 값을 가지고 오고 다시 백업한 값을 가져오면 됨 
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		// temp 잠깐 저장해놓는 용도 
		//temp = x; 백업
		//x = y; x값을 y로 교환 
		//y = temp; 다시 x값을 가져옴 
		
		System.out.println(x);
		
		
	}
	
	public static void ex07() {
		
		int account = 10000;
		
		account += 5000; // account = account + 5000;
		// 자바는 이 식을 이렇게 쓰지 않음 줄여쓸 거임
		// 상황에 따라 완전히 같은 식은 아님 
		
		System.out.println(account);
		
		account -= 50000; // account = account - 50000;
		System.out.println(account);
		
		//+1원씩 들어온다면 어떻게 해야하나 ? ++a 활용
	
		
		
		
	}
	
	public static void ex08() {
		
		long account = 123456;
		// 5% 이자를 받으면 얼마 
		
		//@ 작성 값 
		//double a = (double)account * 0.05 + account;
		//System.out.println(a);  
		//129628.8
		
		//result = account + account * 0.05; 이걸 더 간단하게 만들면 
		
		double result;
		result = account *1.05;
		
		System.out.println(result); //129628.8 간단하게 쓰는 방법을 공부
		
	}
	
	

	
	public static void main(String[] args) {	
		ex08(); 
		
	
		//ex01 메소드를 호출하겠다 
		
		
		
		//빠르게 수정하려면 더블클릭 ctrl+c and ctrl +v 
		// 습관 들이는게 좋음 (틀리지 않기 때문에)
		
		//alt + 방향키 누르면 전체 코드 이동 가능함 
		//메인 메소드가 두개인지 확인할 것
		// 메인 메소드에 결과 보고자 하는 값을 입력해야 값이 나옴 
		// public static void 이름() } - 잊지 말기 
		
		// 메소드 옆 마이너스를 누르면 보고 싶은 코드만 보기 가능
		
		
		
			
		
	}


}
