package Ex03_method;

public class DrinkMachine {
	//필드
	int moneyPot;
	String [] menu = {"콜라","사이다","주스"};
	int [] prices = {1500,2000,3000};
	
	
	
	
	//메소드
	DrinkMachine buyDrink(int money, int choice) {
		int price = prices[choice - 1];//int price = prices[2]
		if(money < prices) { //기능
			DrinkMachine dm = new DrinkMachine();
			dm.back = money;
			return dm;
		}
		
	}
}
