package ex03_throw;

import java.util.Scanner;

import javax.management.RuntimeErrorException;



public class MainClass {
	
	
	public static void ex01() {
		
		try {
			Integer.parseInt("히히");
			int a = 4/0;
			System.out.println(a);
			
			
		}catch(Exception e) {
			System.out.println(e.getClass().getName()); //주석 강사님거 확인
			System.out.println(e.getMessage());
		}
}

	public static void ex02() {
		
		try {
			Integer.parseInt("호홓");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void ex03() {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();
			
			if(age <0 || age > 100) {//1. 원래는 return을 입력했지만 예외상황을 적용할 것 
				throw new RuntimeException(age + "살은 불가능합니다");
				
			}
			
			System.out.println(age >= 20? "주류 구매 가능 " : "주류 구매 불가능");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}finally {
					sc.close();
				}
}
	public static void main(String[] args) {
		ex03();

	}

}
