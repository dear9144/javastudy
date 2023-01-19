package ex05_exception_class;

public class Gun {
	
	

	private int bullet;
	public static final int MAX_BULLET = 10; //final로 막아놓으면 아무도 못 건드리니까 private을 변경
	//static은 한번만 처리하는게 좋으니까 
	
	//총알 넣기 
	public void reload(int bullet) throws GunException {
		if(this.bullet + bullet > MAX_BULLET) { // 총알이 5개인데 6개를 넣겠다고 하더라 - 안 들어감 
			 throw new GunException("장전 불가능", "A-1");
		}
		this.bullet += bullet;
		System.out.println(this.bullet + "발 장전 완료");
		
		
	}
	
	//총 쏘기 - try catch 할거임 
	public void shoot() throws GunException {
		if(bullet == 0 ) {
		 throw new GunException("총알부족", "A-2");
		}
		bullet--;
		System.out.println("빵! " + bullet + "발 남았음");
		
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
