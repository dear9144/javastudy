package ex02_loop;

public class Ex03_break {
		
			/*
			 	break문
			 	1. switch문 종료
			 	2. 반복문(for, while) 종료 
			 	
			 */
		
			public static void ex01() {
		
		/*
		 	무한 루프 
		 	1. 끝나지 않는 반복문 
		 	2. 형식 
		 		for(;;) 
		 		whlie(true) - 실무에선 주로 사용 
		 */
		
				// 1 ~ 10 만들기
				int a = 1;
				while(true) {
					
					if(a > 10)
					break;
					
			
				}
				
				System.out.println(a);
				a++;
	}
	
			public static void ex02() {
				
				//모금
				// 1회 모금액 60원 현재 60원
				// ?회 모금액 60원 현재 100000원이 넘어가면 stop
				int goal = 100000;
				int money = 60;
				int total = 0;
				int n = 0;
				
		
				 while(true) {
					 
					 if(total >= goal) {
						 break;
						  
					 }
					 
					 total += money;
					 System.out.println(++n + "회 모금액 " + money + "원, 현재 모금액" + total + "원");
				 }
			
			}
					
			/* 
			  while(true) {
			  	
				if(money <= 100000)
					break;
				System.out.println(money);
					}
			System.out.println(n + "회 모금액 " + money + " 현재 " + total + " 원 ");
			money++;
		}
			 */
			
				
	public static void main(String[] args) {
		ex02();

	}

}
