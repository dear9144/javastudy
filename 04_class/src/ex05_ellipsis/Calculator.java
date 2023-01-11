package ex05_ellipsis;

public class Calculator {

	
			/*
			  매개변수 생략
			  1. 전달되는 인수의 개수가 
			 */
	
	double addition(double... numbers) { //배열로 인식 what? numbers가 , 몇개가 넘어오든 다 처리가 됨 
		double total = 0.0;
		for(int i = 0; i< numbers.length; i++) {
			total += numbers[i];
		
		}
		return total;
		
	}
			
			
	
}
