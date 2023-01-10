package ex02_two_dim;

public class Ex01_array {
	
	/*
	 2차원 배열은 1차원 배열이 여러개 있는 것 ,
	 서로 길이가 다른 1차원 배열을 관리할 수 있다. 
	 길이가 서로 달라도 상관 없음 
	 O O O O O - 1차원 배열
	 
	 O O O O O - 2차원 배열 
	 O O O O O
	 */
			
	public static void ex01() {
		
		
			// 2차원 배열 선언
			 int[][] arr; 
			 
			//2차원 배열 생성
			
			 /* o o 
			    o o
			    o o
			 */ 
			 arr = new int[3][2]; //3행 2열, 길이가 2인 배열이 3개가 있다.
			 
			 
			 /* 순회 , 
			 
			 행을 먼저 훑는 방식과 열을 먼저 훑는 방식이 있음 
			 row major(행 우선이다) , column major (열 우선이다)
			 - 자바는 row major (행 우선 방식) 사용 
			 */
			 
			 
			 /* 인덱스
			  [0][0] [0][1]   
			  [1][0] [1][1]   
			  [2][0] [2][1]
			  
			  [i][j]
			  2차원 배열은 다 두개 씀 (브라켓, 인덱스,for 문 두개)
			  
			  
			  */
			 
			 for(int i = 0; i < 3 ; i++) { // i ; 행 번호
				 for(int j = 0; j < 2 ; j++) { //j ; 열 번호
					 System.out.print(arr[i][j] + "\t");
				 } // 안쪽 for문이 끝남
				 System.out.println();
			 }
				 
			
		
	}

	public static void ex02() {
		// 2차원 배열 선언 + 생성
		int[][] arr = new int[3][2];
			
		// 2차원 배열 길이 확인
		System.out.println(arr.length); // 3행이다. 1차원 배열이 3개 있다. 행의 길이를  배열의 개수로 봐도 되는지 ?
		System.out.println(arr[0].length); // 첫번째 1차원 배열 
		System.out.println(arr[1].length); // 두번째 1차원 배열 
		System.out.println(arr[2].length); // 세번째 1차원 배열 
		
		// 2차원 배열 순회
		for(int i = 0; i < arr.length; i++) { //행의 개수
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
		}
			
	}
	
	public static void ex03() { // java c 에선 가로 세로 길이가 동일했어야 함 
		// 1. 선언, 생성 분리
			int [][] arr; // 배열 선언 
			
			//2 차원 배열 생성(행만 생성)
			arr = new int[3][];
			
			//각 행이 가질 열을 생성(각 1차원 배열의 생성)
			arr[0] = new int[5];// 첫번째 1차원 배열 , 길이를 임의로 정함
			arr[1] = new int[3];
			arr[2] = new int[2];
					
			// 2차원 순회
			for(int i = 0 ; i < arr.length; i++) { //arr.length - 행의 개수
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t")  ;
				
				}
				System.out.println();
			}
			
		
		
	}
	
	public static void ex04() {
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9,} //이게 초기화 
		};
		
	
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		ex03();
		
		// TODO Auto-generated method stub

	}

}
