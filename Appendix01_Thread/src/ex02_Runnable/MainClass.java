package ex02_Runnable;

public class MainClass {

	public static void main(String[] args) {
		
		//Runnable 객체인 new Soldier()를 Thread 객체를 생성할 시 전달해 줌
		Thread sol1 =new Thread(new Soldier("김상사", new Gun(10)));
		Thread sol2 =new Thread(new Soldier("박중사", new Gun(6)));
		
		sol1.start();
		sol2.start();
		

	}

}
