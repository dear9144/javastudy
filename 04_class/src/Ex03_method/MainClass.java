package Ex03_method;

public class MainClass {
	public static void ex01() {
	//Calculator 객체 선언 + 생성
		
		Calculator calc = new Calculator();
		//d
		double add = calc.addition(1.5, 2.5); { // 메소드 호출 정의 등 헷갈리면 Calculator로 가서 볼 것 
		System.out.println(add);
		}
		
		
		double sub = calc.subtraction(2.5,3.5); {
			
			System.out.println(sub);
		
		
			//double sub = calc.subtraction(2.)
			
		}
	}
	
	
	public static void ex02() {
		
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		
		CoffeeAndChange coffeeAndChange = coffeeMachine.buyCoffee(1000, 1);
		System.out.println(coffeeAndChange.coffee);
		System.out.println(coffeeAndChange.change);
		
		System.out.println(coffeeMachine.moneyPot);
	}
	
	public static void ex03() {
		
		Car car = new Car();
		
		car.addOil(100);
		
		for(int n = 0; n < 51; n++ ) {
			car.pushAccel();
			
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
		for(int n = 0; n< 11; n++) {
			car.pushBreak();
		
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
	}
	public static void main(String[] args) {
		
		ex03();
	}

}
