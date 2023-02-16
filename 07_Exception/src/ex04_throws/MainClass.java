package ex04_throws;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gun gun = new Gun();
		try {
			gun.reload(10);
			for(int n = 0; n<11; n++) {
				gun.shoot();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		

}
