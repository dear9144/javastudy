package ex02_has_a;

public class Gun {
	
	//필드
	private String model;
	private int bullet;
	private final int MAX_BULLET = 20;
	
	//메소드 
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	
	//총알 넣기
	
	public void reload(int bullet) {
		if(this.bullet == 20) {
			return;
		}
		this.bullet += bullet; 
		this.bullet = (this.bullet > MAX_BULLET)? MAX_BULLET : this.bullet;  
		//현재 총알이 맥스 총알보다 많다면 맥스 총알대로  , 그게 아니면 현재 총알 개수대로

		
	}
	//총알 쏘기
	public void shoot() {
		if(this.bullet == 0) {
			System.out.println("헛빵");
			return;
		}
		
		bullet--;
		//this.bullet--; 
		//매개변수와 필드 이름이 같아서 구분할때 this를 씀 this 다시볼 것 
		//얘는 매개변수가 없어서 안 씀 
		System.out.println("빵");
		
		
		
	}
	
	
}
