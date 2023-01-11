package Ex03_method;

public class CoffeeMachine {
	
	
	// 필드
	int moneyPot; //돈통에는 돈이 안 들어있음 
	String [] menu = {"아메리카노","카페라떼","마끼아또"};
	int [] prices = {900,1500,2000};
	// 메소드
	CoffeeAndChange buyCoffee(int money, int choice) { // 천원이 들어왔고 1번이 들어왔다 
		//int choice 는 선택지가 아메 라떼 마끼아또 중 있으니 3이지만 
		// 배열은 0부터 시작이므로 3 - 1 을 해야함 
		
		//돈이 모자르면 money 그대로 반환 
			
		
		int price = prices[choice - 1];
		 
																/*
																  if(price != 900) {
																  	System.out.println(prices);
																}
																	else if(price != 1500) {
																		System.out.println(prices);
																}
																moneyPot += price; //최종 
																
																 */
																
		if(money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
		}
		
		String coffee = menu[choice - 1];
		moneyPot +=price;
		
		CoffeeAndChange cnc = new CoffeeAndChange(); //인수값이 뭔지 모름
		cnc.coffee = coffee;
		cnc.change = money - price;
		return cnc;
		//return 이 나오면 그 다음 문장은 실행 x 
		//return 밑에 System.out.println();를 쓰면 실행 안됨 
		
		
	}
	//커피머신의 경우 사람이 받는건 커피, 잔돈이므로 class를 만들어서 사용하는 것이 좋음


}
