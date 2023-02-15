package ex02_Runnable;

//Soldier를 스레드 처리 하는 이유 
// : new Soldier할 때마다 해당 객체는 독립적으로 동작한다 

//

public class Gun {
	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shoot() {
		if(bullet == 0) {
			throw new RuntimeException("총알이 없습니다."); //Unchecked Exception
			}
		bullet--;
		System.out.println("빵" + bullet + "발 남았습니다.");
		}
	}