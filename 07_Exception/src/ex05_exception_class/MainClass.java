package ex05_exception_class;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Gun gun = new Gun();
		
			while (true) {
			try {
			System.out.println("1.장전  2. 발사  0.종료 >>>");
			String choice = sc.next();
			
			switch(choice) {
			case "1":
			gun.reload(5);
			break;
			case "2":
			gun.shoot();
			break;
			case "0":
			System.out.println("프로그램 종료");
			//break;는 무한루프가 끝내야 하니까 
			
			sc.close();
			return;
			default :
			throw new RuntimeException("잘못된 선택입니다");
			}
			
			}catch(GunException e) {
				System.out.println("예외코드 :" + e.getExceptionCode());
				System.out.println("예외메시지 :" + e.getMessage());
			}catch(Exception e) {
				System.out.println("예외메시지 : " + e.getMessage());
			}
			
		}
	}
	
}

