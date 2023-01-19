package ex02_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// finally 블록
		
		Scanner sc = null;
		try {
		sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		System.out.println(age >= 20 ? "주류 구매 가능 " : "주류 구매 불가능");
		}
		catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			sc.close(); //finally  블록은 자원(resource) 반납할때 주로 사용한다.
			
		}
		
		
		
	}

}
