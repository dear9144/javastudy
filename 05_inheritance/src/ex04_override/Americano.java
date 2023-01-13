package ex04_override;

public class Americano extends Espresso{

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		super.taste(); 
		System.out.println("아메리카노는 맛있다.");
	}
	
}
