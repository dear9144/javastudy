package ex02_loop;

public class Ex04_continue {

				/*
				 	continue 문 
				 	1. 반복문의 실행 시작 지점부터 다시 실행하라 (종료해서 끝내라는 것이 아님)
				 	2. 어떠 코드를 제외하고 반복문을 실행하고 싶을 때 사용 - 잘 안쓰긴 함
				 	
				 */
	
		public static void main(String[] args) {
					
				// 1 ~ 50 사이에서 4의 배수를 제외하고 출력하기 
				for(int a = 1; a <= 50; a++) {
					
					if(a % 4 == 0) {
						continue;
						// 컨티뉴를 만나면 다시 for문으로 돌아가시오.
					}
					
					System.out.println(a);
					
					}

			}
	}
