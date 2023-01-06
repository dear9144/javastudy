package ex05_op_condition;

public class MainClass {
	
	public static void ex01() {
	
			int a = 3;
			int b = 4;
			
			boolean result1 = a > b;
			boolean result2 = a >=b;
			boolean result3 = a < b;
			boolean result4 = a <=b;
			boolean result5 = a == b;
			boolean result6 = a != b;
			
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			System.out.println(result5);
			System.out.println(result6);
			
	}
			
	
	public static void ex02() {
		
		// 논리 연산
		// 1. 논리 AND : && ,모든 조건이 true 이면 true , 아니면 false
		// 2. 논리 OR : |, (역슬래쉬 위에 있음)
		//              하나의 조건이라도 true 이면 true , 아니면 false
		// 3. 논리 NOT : ! , 조건이 true 이면 false, 조건이 false 이면 true
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 10) && (b == 10); // true
		boolean result2 = (a == 10) && (b == 20); // false
		
		System.out.println(result1);
		System.out.println(result2); // 자주 쓰는 애들
		
		boolean result3 = (a == 10) || (b == 10);
		boolean result4 = (a == 10) || (b == 20);
		
		System.out.println(result3);
		System.out.println(result4);
		
		boolean result5 = !(a == 10);
		boolean result6 = !(a == 20);
		
		System.out.println(result5);
		System.out.println(result6);
		
		
	}
	
	
	public static void ex03() {
		
		// Short Circuit Evaluation
		// 1. 논리 And의 경우 조건의 결과가 false인 경우가 발생하면 더 이상 동작하지 않는다 
		//    최종 결과가 false로 결정됐기 때문이다.
		//    - 예를들어 5가지 결과가 있을때 순차적으로 진행하다 3번째에 false가 나올 시 동작하지 않고 false가 나옴
		// 2. 논리 OR 의 경우 결과가 true 인 경우가 발생하면 더 이상 동작하지 않는다
		//    최종 결과가 true로 결정됐기 때문이다.   
		
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 20) && (++b == 11); // b = 10이 나옴 왜냐면 AND 의 경우 앞 조건이 false가 나와 뒷부분이 실행을 안했기 때문
		boolean result2 = (a == 10) || (++b == 11); // 앞 부분이 
		
		System.out.println(result1);//false
		System.out.println(result2);//true
		
		// 값이 오기로 했는데 안 온 경우 null값이라 함 - 이 원리를 알아야 null값을 알 수 있음
		
		
	}
	
	
	public static void ex04() {
		
		//int score1 = 75;
		//int score2 = 70;
		
		
		//boolean result = (score1 == 70) &&  ; //70점은 true 아니면 false
		
		int score = 75;
		
		boolean result = (score >= 70) && (score<= 80); 
		
		System.out.println(result);
		
		boolean result2 = (score / 10) == 7;
		
		System.out.println(result2);
		
		
	}
	
	
	public static void ex05() {
		
		// 조건 연산 
		// (조건식) ? true 일 시 처리(true를 먼저 실행) : false 일 시 처리할 데이터 작성 
		
		
		int score = 50;
		
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
		
		//항이 세개가 들어가기 댸문에 삼항 연산자라고도 함 
		//항이 1개가 들어가면 단항 연산, 2개 들어가면 이항연산자 
		// 단항 : ++a , --a , !(조건식)
		// 이항 : &&, a+b+c{이거 확인해볼것}
		
		
	
	}
	
	
	public static void ex06() {
		
		//int n = 3;
		//int mod = n % 10;
		//String result = (mo ) ? "짝수" : "홀수"; // 짝수면 짝수가 뜨게 홀수면 홀수가 뜨게 
		
		int n = 3; 
		String result = (n % 2 == 0) ? "짝수 " : "홀수";
		
		System.out.println(result);
		
				
				
	}
	
	
	public static void ex07() {

		
		int n = 3;
		
		String result = (n % 3 == 0) ? "3의배수 " : (n % 2 == 0) ? "짝수" : "홀수";
		
		
		//짝수면 짝수가 뜨게 홀수면 홀수가 뜨게 3의배수면 3의 배수가 뜨게
		
		System.out.println(result);
		
		//0은 제외를 했어야 함 왜냐면 0을 3으로 나누면 0이니까
		// Stiring reult = (n != 0 - 그리고 어떻게 입력? !는 맞으면 false 틀리면 true 인데 차이) : == (같다)의미 !=(다르다)의 의미
		
		String result2 = (n != 0 | n % 2 == 0) ? "홀수" : "짝수";
		
		System.out.println(result2);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ex06();
		ex07();
		
		
			
		
			
		
		
		
	
	}

}
