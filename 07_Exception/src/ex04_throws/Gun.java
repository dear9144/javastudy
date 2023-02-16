package ex04_throws;

public class Gun {
	
	private int bullet;
	public static final int MAX_BULLET = 10; //final로 막아놓으면 아무도 못 건드리니까 private을 변경
	//static은 한번만 처리하는게 좋으니까 
	
	//총알 넣기 
	public void reload(int bullet) throws RuntimeException {
		if(this.bullet + bullet > MAX_BULLET) { // 총알이 5개인데 6개를 넣겠다고 하더라 - 안 들어감 
			 throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
		
		
	}
	
	//총 쏘기 - try catch 할거임 
	public void shoot() throws RuntimeException {
		if(bullet == 0 ) {
		 throw new RuntimeException("총알 부족 ");
		}
		bullet--;
		
	}
	
	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}

	public static int getMaxBullet() {
		return MAX_BULLET;
	}
}
