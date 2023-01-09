package ex02_loop;

public class Ex05_nested_loop {
	
	
	public static void ex01() {
				
				// for문이 반복됨
				for(int day =1 ; day <= 5; day++ ) {
					for (int hour = 1; hour <= 8 ; hour++) {
						System.out.println(day + " 일차 " + hour + "교시 수업");
					}
				}
	}

	
			public static void ex02() {
		
				
					/*int day = 1;
					int hour = 1;
					while(true) {
						if(day <=5)
							break;
						while(true) {
							if(hour <=8)
								break;
							System.out.println(day + " 일차 " + hour + "교시 수업");
							day++;
							hour++;
						}
					}*/
					
		
					//강사님 예제 확인
					
	}
	
			public static void ex03() {
						// 전체 구구단 출력하기 
						// 2 x 1 = 2 등등등
						for(int a = 2; a < 10 ; a++) {
							for(int n = 1 ; n <=9; n++) {
								System.out.println(a + " x " + n + " = " + (a * n));		
							}
						}
			
		
	}
			
			public static void ex04() {
						// 전체 구구단 출력하기
						// 2x1=2, 3x1=3 .... 9x1=9
						// 2x9=18 3x9=27.... 9x9=81
						
						for(int a = 2; a <= 9; a++) {
							for(int n = 1; n <= 9; n++) {
								System.out.print(a + "x" + n + "=" + (a*n)+ "\t");
								
						}
				System.out.println();
						}
			}
			
						/* 	내가 작성한 코드 
						 	for(int a = 2; a <= 9; a++) {
										for(int n = 1; n <= 9; n++) 
											System.out.print(a + "x" + n + "=" + (a*n)+ "\n");
											
									
						}
								1. 안쪽 for 문 괄호 작성 안함
								2. 줄 내리기 \n 작성 안함 
						 */
	public static void main(String[] args) {
		ex04();

	}

}
