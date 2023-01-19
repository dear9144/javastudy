package practice05_Cart;

public class Customer {
	
	private int myMoney;//돈이 중요해
	private int myPoint;
	private Cart myCart;//카트가 있어야 끌어 
	
	public Customer(int myMoney,int myPoint) { //고객의 입장을 고객의 생성으로 보고 생성 순간 카트 하나씩 쥐어준다고 생각
		this.myMoney = myMoney;
		this.myPoint = myPoint;
		//카트는 생성만 했으니 선언을 해야함 
		this.myCart = new Cart(10);
		
		//27. getter setter 넣음 
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	public Cart getMyCart() {
		return myCart;
	}

	public void setMyCart(Cart myCart) {
		this.myCart = myCart;
	}
	
	//카트에 물건 담기 ,이건 사람이 하는 행동임 
	public void addToCart(Product product) { //카트는 만들었으니까 호출만 하자
		myCart.addProduct(product);
	}
	//카트에서 물건 빼기
	public void deleteFromCart(int prodNo) {
		myCart.deleteProduct(prodNo);
	}
	//28. 물건 구매하면 영수증을 String 형태로 반환하는 형식 구현
	public String buy() {
		int buyMoney = 0; //구매한 물건들의 가격 합계 초기화 해야함
		int buyPoint = 0; //구매한 물건들의 가격에 의한 포인트  초기화 해야함
		
		//30. 영수증 만들기 
		String receipt = "---- 영수증 ----\n"; //영수증  
		
		for(int i = 0; i <myCart.getProdCount(); i++) { //myCart.getProdCount 카트에 담긴 전체의 물건 개수 
			
			
			Product product = myCart.getProducts()[i];  //카트에서 뺀 물건 하나 = 배열을 뺌(myCart.getProducts()) 이게 배열  
			buyMoney += product.getProdPrice(); //제품에 가격 더해줌 
			buyPoint += product.getProdPrice() * 0.05; //29.제품 가격 5%를 포인트로 지급 
			receipt += product.getProdName() + "  " + product.getProdPrice() + "원\n"; //31. 영수증에 제품 이름 제품 가격 쓸거임
			//32. 이 for문을 계속 반복하다보면 돈이 계속 줄어드니 0원이 되면 구매가 불가능한걸 만들어야 함
			// 위로 돈 부족
			
			//33. 구매가 불가능한 경우 : 돈이 부족함
			if(myMoney < buyMoney) {
				System.out.println("돈이 부족합니다. 구매를 종료합니다.");
				return""; // 영수증이 안나온다 아무것도 안 쓴다 혹은 return null; 가능 
			}
		
		}
		//33. 영수증 적기 전에 구매 포인트만큼 내 포인트가 늘어야 하기에 작업 해줌 
		myPoint += buyPoint;
		myMoney += buyMoney;
		//34. 다하고 main으로 감
		receipt += "------------------------\n";
		receipt += "발생한 포인트" + buyPoint + "점\n";
		receipt += "보유 포인트" + myPoint + "점\n";
		receipt += "구매총액" + buyMoney + "원\n";
		return receipt;
	
}
	
}
