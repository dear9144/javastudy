package ex01_one_dim;

public class Ex01_array {

	
			/*
			 	배열이란?
			 	1. 여러 개의 변수를 하나의 이름으로 관리하는 자료 구조 중 하나
			 	2. for문 같은 제어문으로 접근 가능 
			 	3. 배열의 구성요소 
			 		1) 배열의 이름 : 모든 변수의 대표 이름 (한가지 이름을 사용)
			 		2) 인덱스 : 각 변수를 구분하기 위한 위치 정보 . 0부터 시작하는 정수값.
			 
			 */
	
			 /*
			  	배열의 사용 방법
			  	1. 배열의 선언 작업 
			  	(변수 사용시 선언만 있어도 가능)
			  		1) int[] arr; - java에선 이렇게 권장
			  		2) int arr[]; - c언어에서 사용
			  		
			  	2. 배열의 생성
			  	(배열 생성시 배열 생성이 필요)
			  		arr = new int [5] - 정수 5개 저장할 수 있는 배열이 만들어짐 
			  	
			  */
	
			/*
		 		배열의 요소 
		 		1) 배열의 각 변수를 의미 
		 		2) 배열의 이름 [인덱스]	
		 		3) 배열이 생성되면 자동으로 초기화된다.
			 			0,	 0.0, 	false,   null 값으로 초기화 된다. (값이 없음을 의미)
			 		  정수,	실수,	boolean, 참조 - 0은 false와 같다고 생각 ,1은 true라고 생각 다 같은 값이라고 생각
			 		  					 	string
			 	int a;
			 	a의 값이 얼마인지 모름
			 	그러나 garbage라는 값을 가지긴 함  	  					 	
			 */
			
		public static void ex01() {
				
				// 배열 선언
				int[] arr; 
				// 배열 생성
				arr = new int [5];
				
				System.out.println(arr[0]); //첫번째 변수는 0 
				System.out.println(arr[1]);  
				System.out.println(arr[2]);  
				System.out.println(arr[3]);  
				System.out.println(arr[4]);  
			
	}
	
		public static void ex02() {
		
				//배열 선언 + 배열 생성
				
				int[] arr = new int[5];
				
				//배열 요소 순회(하나씩 접근하기)
				//index : i = 0 , i < 5
				
				for(int i= 0; i<5; i++) {
					System.out.println(arr[i]);
				}
					
				
				//ex01 과 ex02는 완전히 똑같은 코드임 
		
	}
	
		public static void ex03() {
		
				// 배열 길이
				int length = 5;
				
				// 배열 선언 + 생성
				int[] arr = new int[length];
				// 배열 순회
				for(int i = 0; i< length; i++) {
					System.out.println(arr[i]);
					
				}
	}
	
			
		public static void ex04() {
			//배열선언 + 생성
			int[] arr = new int[5];
			
			// 배열 순회의 베이스 - 특별한 사유가 없을 시 앞으로 사용하게 될 코드 조합 
			// 이 문장으로 공부 
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
		//지금까지 똑같은 코드를 4번 찍었다고 생각하면 됨..
		
		public static void ex05() { // 연습
			
			// score 배열로 관리
			int[] scores = new int[5];
			// 각 점수를 배열에 저장
					scores[0] = 100;	
					scores[1] = 70;	
					scores[2] =	95;
					scores[3] =	83;
					scores[4] = 76;
					
					//합계(평균) 최대 최소
					int total = 0;
					int max = 0;
					int min = 100; //가질 수 있는 최댓값을 넣어야 함 
					// max 가 0 인건 가장 작은 값을 초기화로 가진 것
					// min 가 100 인건 가장 큰 값을 초기화로 가진 것 
					for(int i = 0; i < scores.length; i++ ) {
						total += scores[i];
						if(max < scores[i]) {
							max = scores[i];
						}
						if(min > scores[i]) {
									min = scores[i];
								}
							}
					System.out.println("합계 : " + total + "점");
					System.out.println("평균 : " + (double)total/scores.length + "점");
					System.out.println("최대 : " + max + "점");
					System.out.println("최소 : " + min + "점");
					}
				
		//반쪽짜리 문제임 
		
		
		
		
			public static void ex06() { // 연습
				
				// 배열의 첫 번째 요소를 초기화로 저장하고,
				// 배열의 두 번째 요소부터 순회한다.
				// 이 배열을 추천함! 
				
				int[] scores = new int[5];
				// 각 점수를 배열에 저장
						scores[0] = 100;	
						scores[1] = 70;	
						scores[2] =	95;
						scores[3] =	83;
						scores[4] = 76;
						
						//합계(평균) 최대 최소
						int total = scores[0];
						int max = 0;// max 가 0 인건 가장 작은 값을 초기화로 가진 것
						int min = 100; //가질 수 있는 최댓값을 넣어야 함 
						// min 가 100 인건 가장 큰 값을 초기화로 가진 것 - question
						
						/* 
						 예를 들어 학생이 점수를 잘 받아 모두 100점이라고 한다면 
						 최솟값의 초기화 값이 0이 되버린다면 무조건 0이 되기 때문에
						 숫자의 최대값을 작성하는 것이 맞다
						 */
						
						for(int i = 1; i < scores.length; i++ ) {
							total += scores[i]; // scores[0]를 2번 더해 합계 평균이 이상해짐 
							if(max < scores[i]) {
								max = scores[i];
							}
							if(min > scores[i]) {
										min = scores[i];
									}
								}
						System.out.println("합계 : " + total + "점");
						System.out.println("평균 : " + (double)total/scores.length + "점");
						System.out.println("최대 : " + max + "점");
						System.out.println("최소 : " + min + "점");
						}
					
			

			public static void ex07() {
				
				// 배열 초기화
				int[] arr =  {10,20,30};
				
				// 배열 순회 
				for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				
				}
				
				
			}
			
			
			public static void ex08() {
				
				String[] weekName = {"토","일","월","화","수","목","금"};
				int day = 13;
				
					System.out.println(day + "일은 " + weekName[day % weekName.length] + "요일이다.");
				
				
			}
				
			public static void ex09() {
				
				String[] season = {"겨울","봄","여름","가을"};
				int month = 6;
						System.out.println(month + "월은 " + season[month % 12/3] + "이다" );
				
			}
			
			// 문제 다시 풀어보기.. 모르겠음
		public static void main(String[] args) {
		ex09();
		
		

	}

}
