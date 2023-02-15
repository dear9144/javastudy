package ex02_Runnable;

public class Soldier implements Runnable{
	
	private String name;
	private Gun gun;
	
	public Soldier(String name, Gun gun) { //new Soldier("김상사", new Gun(10))
		this.name = name;
		this.gun = gun;
	}
	
	public void shoot() {//[김상사] 빵 ! 9발 남았습니다.
		System.out.print("[" + name + "] "); 
		gun.shoot();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 1초에 1발씩 
		// 1초동안 일시중지 시키기 : Thread.sleep(1000); 1000밀리초(1초) 일시중지 ->예외처리 필요 강제로 멈추는 것 
		// 동작 천천히 보려고 
		
		try {
			while(gun.getBullet() !=0) {
				shoot();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
		e.printStackTrace();
		
	}

	


	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public 
	
	