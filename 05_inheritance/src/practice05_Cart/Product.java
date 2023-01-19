package practice05_Cart;

public class Product {
	
	//공통적으로 있을만한 요소 이름,가격,제품번호(이름이 같은 제품이 있으니 구분하려고 제품번호)
	
	private int prodNo; //1. 제품번호
	private String prodName;//제품이름 
	private int prodPrice;
	
	//new Product(1, "새우깡",2000) //2. 생성자를 만들자 소스 메뉴가서 만들기
	public Product(int prodNo, String prodName, int prodPrice) {
		super();
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	} //3.getter setter 만들기

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	//3. 이제 제품을 만들 것임 (meat로가)
	
	
	
	
	

}
