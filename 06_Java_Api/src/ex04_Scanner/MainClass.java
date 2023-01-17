package ex04_Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {	

	public static void main(String[] args) {
		//scanner
		
		
		//기본 입출력 장치(console)
	
		//Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//String 입력
		System.out.print("이름이 뭐에요? >>>");
		String name = sc.nextLine();//공백 불가능으로 
		System.out.println("입력된 이름은 " + name + "입니다.");
		/*System.out.print("이름이 뭐에요? >>>");
		String name = sc.next();//공백 가능으로 
		System.out.println("입력된 이름은 " + name + "입니다.");
	*/
		
		
		//int 입력
		System.out.print("몇 살이에요?? >>>");
		int age = sc.nextInt();
		System.out.println("입력된 나이는 " + age + "살 입니다.");
		
		//double 입력
		System.out.println("키는 얼마인가요? >>>");
		double height = sc.nextDouble();
		System.out.println("입력된 키는 " + height + "cm 입니다. ");
		
		
		//char 입력
		System.out.println("성별은 무엇인가요? >>>");
		char geder = sc.next().charAt(0);  // charAt(0)은 첫글자만 나오게 해서 도출 
		System.out.println("입력된 성별은 " + geder + "입니다.");

		//Scanner 객체 종료 (생략 가능)
		sc.close();
		
		
	}

}
