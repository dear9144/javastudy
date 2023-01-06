package ex02_casting;

public class Ex01_promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동변환 
		//1.작은크기 -> 큰 크기
		//2.정수 - > 실수
		
		long money = 10000L; // 4byte 를 사용한 10000이 8byte money 로 promotion 됨 
		System.out.println(money);
		
		double score = 90; // 정수 90을 실수 90.0으로 promotion함 
		System.out.println(score);
		
		//이는 자동으로 변환됨을 인지하기 큰 - 작은 
		
		
		
	}

}
