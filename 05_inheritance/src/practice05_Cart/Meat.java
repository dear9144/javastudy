package practice05_Cart;

public class Meat extends Product { //4. 상속을 하기 위해 상속선언 
	/*오류가 뜨는데 그 이유는 코드를 빨리 채워라는 의미 
	 * 
	//new Product(1, "새우깡",2000) //2. 생성자를 만들자 소스 메뉴가서 만들기
	를 빨리 채우라는 의미임 = 디폴트 생성자 호출이라도 하고 싶은데 안되는 상황 
	그러니 위의 생성자를 직접 호출해 달라 
	
	부모의 디폴트만 생략하고 호출이 가능한데 부모 생성자에 디폴트가 없어서 호출하라는 의미
	
	*/
	//5.new Meat(1, "소고기",5000)를 만든다고 가정
	public Meat(int prodNo,String prodName,int prodPrice) {// 이걸 product에 저장할거야
		//6. super //슈퍼는 product를 의미
		super(prodNo, prodName, prodPrice);
		
		//7.피자 칸으로 가
		
	}
		
	}


