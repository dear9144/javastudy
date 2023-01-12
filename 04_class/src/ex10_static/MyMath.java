package ex10_static;

public class MyMath {
	
	//필드
	public static final double PI = 3.141592;

	
	
	//메소드 
	//public double max();
	public double getCirclearea(double radius) { //radius : 반지름
	//프론트 할때 필요함 외우기 
		return PI * radius * radius;		
	}
	public static double max(double...numbers) {
		double max = Double.MIN_VALUE;
		
		for(int i = 0 ; i<numbers.length; i++) {
			if(max <numbers[i]) {
				max = numbers[i];
		
	
			}
		}
		
		return max;
		
	}
	public static double min(double...numbers) {
		double min = Double.MAX_VALUE;
		
		for(int i = 0; i <numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
			
		}
		return min;
	}
	
}
