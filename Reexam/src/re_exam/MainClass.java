package re_exam;

import java.util.Arrays;

public class MainClass {
	
	public static void ex01() {
		
		//1.절대값구하기
		
		/*int number = 5;
		int absNumber;
		if(number>=0) {
			absNumber = number;
		}else {
			absNumber = number * -1;
			//absNumber = -number;
			//두개 다 가능 
			
			}System.out.println(absNumber);
		}
	*/
		int number = 5;
		
	int absNumber =  (number>= 0 ? number : -number); 
	System.out.println(absNumber);
	}
	
	public static void ex02() {
		// 나이에 따른 구분하기
		// 0 ~ 7 미취학 아동 
		// 8~ 13 초등학생
		//14 ~ 16 중학생 
		// 17 ~19 고등학생 
		// 20 ~ 100 성인 
		// 나머지 : 잘못된 나이 
		
		String strAge = "30"; // 나이가 크다 작다 못 씀 그래서 문자열을 숫자로 바꿀 것
		int age = Integer.parseInt(strAge);
		if(age < 0 || age >100) {
			System.out.println("잘못된 나이");
			}else if(age <= 7) { 
				System.out.println("미취학 아동");
			}
		   else if(age <= 13) {
			System.out.println("초등학생");
					}
			else if(age <= 16) {
				System.out.println("중학생");
			}
			else if(age <= 19) {
				System.out.println("고등학생 ");
			}
			else {
				System.out.println("성인 ");
			}
	}
		
			/*switch 사용이 자주 쓰는 경우
			단순 문자열들 사용 시 좋음 
			*/
	
	public static void ex03() {
		
			//삼각형 넓이 구하기 
			int width = 3;
			int height = 3;
			double area = (double)width * height /2;
			System.out.println(area);
	}
				
	
	public static void ex04() {
		
			//월 -> 계절과 마지막 일 출력하기 , ex.1월,겨울,31일 
			/* month % 12/3 
			 겨울 : 0
			 봄 : 1
			 여름 : 2
			 가을 : 3
			 
			*/
		int month = 1; 
		String[] season = {"겨울","봄","여름","가을"};
		int [] lastday = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//0은 안넣어도 되고 넣어도 됨 아무것도 안함
		System.out.println(month + "월은" + season[month % 12/3 ] + "입니다.");
		System.out.println(month + "월은 " + lastday[month] + "일까지 있습니다.");
		
		
	}
	
	public static void ex05() {
		
		//10과 가까운 수
		int a = 8;//2 차이
		int b = 11;//1 차이
		
		//int diff1 = 10 - a ;
		//int diff2 = b - 10 ;
		//10이랑 비교했을때 어떤게 더 큰가 
		int diff1 = (a> 10) ? a- 10 : 10 -a ;
		int diff2 = (b> 10) ? b- 10 : 10 -b;
		System.out.println("10과 가까운 수는 " + (diff1>diff2 ? a : b ) + "입니다.");
		
	}
	
	public static void ex06() {
		//화폐 단위 쪼개기 money 분리하기 
		int money = 87654;
		//87654을 5만원으로 나눔 , 37654를 1만원으로 나눔, 7654를 5000원으로 나눔
		
		int[] unit = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] count = new int[unit.length];//배열이 10개가 나와서 많으니까 저장할 배열 만듬 
		/*money / unit[0] = 50000원 개수
		money/ unit[1] = 10000원 개수 
		
		/*count[0] = money /unit[0];
		money = money % unit[0];
		count[1] = money/unit[1];
		money = money % unit[1];
		  10까지 반복하면 됨 */
		for(int i = 0 ; i <unit.length;i ++) {
			count[i] = money/ unit[i];
			money %= unit[i];
			System.out.println(unit[i] + "원권 : " + count[i] + "개");
		}
		System.out.println(Arrays.toString(unit));
		System.out.println(Arrays.toString(count)); //arrays를 쓰면 맨 위로 가보면 import ~ Arrays생겼음
		//나중에 수업시간에 배울 것임  
	}
			
	 public static void ex07() {
		 //2차원 배열에 구구단 결과 저장하기 
		 int [][] arr = new int[8][9];
		 
		 for(int i = 0 ; i <arr.length; i++) {
			 for(int j = 0; j <arr.length; j++) {
			// System.out.print( String.format("%3d",arr)arr[i][j]) );
			 }
			 //System.out.printlb(); 
			 /* arr[0][0] = 2 * 1 ;
			 arr[0][1] = 2 * 2 ;
			 arr[0][2] = 2 * 3 ;
			 arr[0][3] = 2 * 4 ;
			 arr[1][0] = 3 * 1 ;
			 arr[1][1] = 3 * 2 ;
			 arr[1][2] = 3 * 3 ;
			 arr[1][3] = 3 * 4 ;
			 arr[2][0] = 4 * 1 ;
			 arr[2][1] = 4 * 2 ;
			 arr[2][2] = 4 * 3 ;
			 arr[2][3] = 4 * 4 ;
			 */
			// } 
		// }
		// }
		 /* for(int i = 0 ; i <arr.length; i++) {
		  System.out.println(Arrays.toString(arr[i]));
		  */
		 
			for(int[] a : arr) {
				System.out.println(Arrays.toString(arr[i]));
			}//향상 for문 
		 }
	 }
	 
	//double area = width * height /2.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex06();

	}

}
