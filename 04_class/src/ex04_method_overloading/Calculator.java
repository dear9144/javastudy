package ex04_method_overloading;

public class Calculator {
	
	
	
	
	double addition(double a , double b) {
		return a + b;
	}
	
	double addition(double[] numbers) {
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
			
		}
		return total;
	}
}


