package ex03_parsing;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구문 분석 parsing
		// 문자열을 기본 타입으로 변환하는 과정을 의미한다.
		
		String strscore = "90";
		String strMoney = "100000000";
		String strEye = "0.7";
		
		//int로 변환 
		
		int score = Integer.parseInt(strscore);
		//interger. class가 가지고 있는 기능을 (메소드를) 보여줌
		System.out.println(score);
	
		//String - > long 으로 변환
		long Money = Long.parseLong(strMoney); // 대문자 L과 소문자 l은 다름
		System.out.println(Money);
		
		double eye = Double.parseDouble(strEye);
		System.out.println(eye);
	}

}
