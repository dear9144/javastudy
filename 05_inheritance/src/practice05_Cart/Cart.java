package practice05_Cart;

public class Cart {// 14.제품으 ㄹ여러개 담을 수 있는 카트임
	
	private Product[] products;
	private int prodCount;//15.카트에 담을 개수 , 
	//16. 카트 물건 관리가 될것임 근데 작은 카트와 큰 카트가 있다고 가정 
	// new Cart(10), new Cart(20),...
	//카트 직접 만들어야 함 왜냐면 자동으로 하면 그게 안됨
	//17. private int prodCount는 product 배열에 저장된 product 개수임 (최대 사이즈가 10인거지 10개가 다 담긴게 아니기 때문)
	//즉, 배열의 크기가 10이라는 것이다 그 증거가 선언은 했으나 생성은 안했음 
	public Cart(int cartSize) {
		products = new Product[cartSize];
		//18. private Product[] products; 배열 생성
		//products = new Product[cartSize]; 배열 선언 
		//19.products = 0; 적어야 하나? nono 필드는 자동 초기화 되기 때문
		//이로써 생성자 완성 getter setter 만들러 가자 (물건 넣고 빼기가 필요하기 때문)
		
		
		
	}//20. getter setter 완성 (소스에 게터 세터 만들기 하면 됨)
	//21 구현해낼 메소드 만들러 가자 
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public int getProdCount() {
		return prodCount;
	}
	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	//21. 카트에 물건 담기 (카트에 물건이 담아지는 행위)
	public void addProduct(Product product) { //물건이 필요함 
		//22. 조금더 멀리 생각해보면 addProduct(new Meat(1."소고기",5000))
		//addProduct(new Pizza(1."고구마 피자",3000))
		//addProduct(new Noodle(1."누들면",1500))
		//23. 카트가 가득 차면 물건을 담지 못한다.
		if(products.length == prodCount) {//addProduct를 계속 차면 물건이 가득 찰텐데 최대가 10이니까 
			//products.length, prodCount 가 같으면 꽉 찬거임
			//이걸 오늘 배운걸로 예외처리 exception으로 하면 됨 
			
			System.out.println("카트가 가득 찼습니다.");
			return;
			
			
		}
		
		//카트에 물건담기, addproduct는 완성 
		products[prodCount++] = product; //물건이 늘어날테니 prodCount를 넣어야함 
		
		//카트 물건 빼
				
	}
	//카트 물건 빼기 만약 물건의 처음과 끝이 아닌 중간 물품을 뺀다면? 
	public void deleteProduct(int prodNo) { //삭제할 제품 받아왔다 치고 (제품 번호를 받는다 치고)
	//예외상황 : 카트가 비어있으면 뺼 물건이 없지?
	if(prodCount == 0) {
		System.out.println("카트가 비어있습니다.");
		return; //메소드 종료 
	}
	//24.카트 물건 빼기 번호빼기로 할것임 
	//deleteProduct(1)
	//deleteProduct(2) . . . 
	for(int i =0; i<prodCount; i ++) { 
		if(products[i].getProdNo() == prodNo) { //제품 , getProdNo 카트에 저장돼있는 물건 넘버
			//물건이 5개 있다고 가정하고 나머지는 null값이라 치면 , 1.하나씩 복사하거나 2. 마지막걸 옮겨주는 방법 
			//마지막걸 옮겨주는 방법 쓸거임 products[4]이 마지막 물건이니 
			products[i] = products[--prodCount]; //마지막 물건을 뺀 물건 자리로 옮기기 성공 ! 
			//물건을 뺐으니 prodCount가 줄어야 함 
			//[prodCount - 1] 이거를 --prodCount이거로
			break;
			//25. System.arraycopy() - 배열에 있는걸 다른 배열로 옮겨주는 메소드를 써서 복사해서 써도 됨 
		}
}			//26. 카트 끝 사람 만들러 가자 Customer
	}
}

