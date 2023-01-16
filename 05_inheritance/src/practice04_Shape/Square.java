package practice04_Shape;

public class Square extends Rectangle {

	
	//필드 필요 없음 (Rectangle이 가지고 있으니까)
	
	//생성자 - 필드가 없으므로 필드 기반 생성자 생성은 안됨
	public Square(double width) {
		super(width, width);
		
		//값이 하나이기 때문에 한개를 지움
	
	}
	
}
