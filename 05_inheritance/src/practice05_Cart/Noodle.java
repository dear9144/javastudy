package practice05_Cart;

public class Noodle extends Product {
	//10. 상속
		//11. new Noodle(3,"누들면", 누들면)
		//12. generation constructors from Superclass 
		
	public Noodle(int prodNo, String prodName, int prodPrice) {
		super(prodNo, prodName, prodPrice);
		//13.이로써 product 완성 , 부모 쪽에 getter setter를 생성 가능, cart 만들러 가자 
	} 

}
