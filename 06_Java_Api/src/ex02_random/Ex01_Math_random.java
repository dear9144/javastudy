package ex02_random;

public class Ex01_Math_random {
	
	public static void ex01() {
		
		//java.lang.Math 클래스
		double randNumber = Math.random(); //0.0 <= 난수 <1.0
		//System.out.println(randNumber);
		if(randNumber < 0.1) {
			System.out.println("대박");
		}else {
			System.out.println("꽝");
		}
	}

	
	public static void ex02() {
		//난수 생성하기 
		
		StringBuilder sb = new StringBuilder();
		for(int count = 0 ; count < 6; count ++) {
			sb.append((int)(Math.random()* 10));
		}
		String code = sb.toString();
		System.out.println(code);
			
		}
	
	
	public static void main(String[] args) {
		ex02();
		
			
	}

}
