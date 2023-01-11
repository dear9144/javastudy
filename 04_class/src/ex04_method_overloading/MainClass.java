package ex04_method_overloading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Calculator 객체 선언 (어떤 클래스를 기반으로 )
		
			Calculator calc;
		
			//Calculator 객체 생성
			
			calc = new Calculator();
			
			// addition(double a , double b) 호출 , 메소드 호출시 객체 생성 필요 위에걸 사용
			
			
			//Calculator의 메소드로 위의 값이 들어가 수행 후 다시 MainClass 로 return 해줌
			
			double result = calc.addition(1.5, 2.5);
			System.out.println(result);
			
			
			//addition(double[] numbers) 호출
			double[] arr = {1.1,2.1,3.3}; //1. 초기화
			double result2 = calc.addition(arr); // 2.처음 만들시 아직 안만들어서 오류날 것임 어디에?  Calculator에
			System.out.println(result2);
	}

}
