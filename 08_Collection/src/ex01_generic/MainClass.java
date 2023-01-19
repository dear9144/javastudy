package ex01_generic;

public class MainClass {

	public static void main(String[] args) {
		
		//Box box1 = new Box();
		Box<Integer> box1 = new Box<Integer>();
		//정수를 저장할 수 있는 박스
		box1.setItem(10);
		System.out.println(box1.getItem());
		
		//jdk 1.7이후로 생성자에는 자료형을 생략할 수 있음 

	}

}
