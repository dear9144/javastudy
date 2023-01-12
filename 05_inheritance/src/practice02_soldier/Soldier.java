package practice02_soldier;

public class Soldier { 
	
	//필드 
	private Gun gun;
	public Soldier() {
		
		gun = new Gun();
	}
	
	public void reload(int bullet) {
		gun.reload(bullet);
	}

	public void shoot() {
		gun.shoot();
	}
}
