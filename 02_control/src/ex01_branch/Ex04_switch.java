package ex01_branch;

public class Ex04_switch {
	
		/*
		 	switch(표현식) {
		 	case 어떠한 값1 : 실행문 
		 	case 어떠한 값2 : 실행문
		 	...(원하는 개수만큼)
		 	default: 실행문 - if else 에 마지막else 같은 느낌
		 	}
		 	표현식의 결과로 주로 사용하는 타입
		 	- int
		 	- string
		 	
		 	표현식의 결과로 사용 불가능한 타입 - if문과 다른 점 
		 	- boolean
		 	- double 
		 	- long
		 	
		 	switch
		 	if 문하고는 다름 
		 	조건식을 사용하지 않음
		 	if(조건문은 이곳에 조건이 들어감) {
		 	switch(a>0) -> 오류 생김 
	
		 */
		 		
		
		public static void ex01() {
			int month = 1;
			switch(month) {
			case 12 :
			case 1 :
			case 2 : System.out.println("겨울"); break;
			case 3 : 
			case 4 :
			case 5 : System.out.println("봄"); break;
			case 6 :
			case 7 : 
			case 8 : System.out.println("여름"); break;
			default : System.out.println("가을");
			
			}
			
			/*
			 case 특정 숫자를 입력할 시 그 밑으로는 멈춰야 하는데 멈추는게 없어서 
			 그 뒷부분도 실행이 되는 것임
			 break; 를 넣어줘야 함 그래야 실행 후 멈춤
			   		switch 문 멈춰라 
			 */
			
			
		}
	
		
		public static void ex02() {
			
			int day = 13;
			
			String weekName;
			
			switch(day % 7) {
			case 0: weekName = "토"; break;
			case 1: weekName = "일"; break;
			case 2: weekName = "월"; break;
			case 3: weekName = "화"; break;
			case 4: weekName = "수"; break;
			case 5: weekName = "목"; break;
			default: weekName = "금"; 
			}
			
			System.out.println(day + "일은 " + weekName  + "요일이다");
			}
			
			
		public static void ex03() {
			//수,우,미,양,가,잘못된 점수
			
			int score = 50;
			//String scoreName;
		
			/*잘못된 점수 포함 시 
			switch(score / 10) {
			case 10 :
			case 9 : System.out.println("수"); break;
			case 8 : System.out.println("우"); break;
			case 7 : System.out.println("미"); break;
			case 6 : System.out.println("양"); break;
			case 5 : 
			case 4 : 
			case 3 : 
			case 2 : 
			case 1 : System.out.println("가"); break ;
			default : System.out.println("잘못된 점수");
			 */
			
			
			
			
			// 잘못된 점수 포함 x
			
			switch(score / 10) {
			case 10 :
			case 9 : System.out.println("수"); break;
			case 8 : System.out.println("우"); break;
			case 7 : System.out.println("미"); break;
			case 6 : System.out.println("양"); break;
			default : System.out.println("가"); break;
				
}
			
			System.out.println(score + "입니다");
			
				
		}
			
			
			
			
			
			
		
		public static void ex04() {
			
			//1분기 2분기 3분기 4분기 를 만드시오 
			
			int month = 2;
			
			/*
			 첫번째 방법
			  
			 	System.out.println((month - 1) / 3 +1 + "분기");
			 	- 최종적으로 switch문 안 쓰고 이렇게 해석할 수도 있음 
			
			 두번째 방법
			 
			 	switch((month - 1) / 3) {
		 		
			 	case 1 : case 2: case 3: 
					System.out.println("1분기");
					break;
			 	case 4 : case 5: case 6:  
					System.out.println("2분기");
					break;
				case 7 : case 8: case 9: 
					System.out.println("3분기");
					break;
				default :
					System.out.println("4분기");
					
					 */
			switch((month - 1) / 3) {
		 		case 1 :
		 		System.out.println("1분기");
				break;
				case 2 :
				System.out.println("2분기");
				break;
				case 3 :
				System.out.println("3분기");
				break;
				default :
				System.out.println("4분기");
			
			
					
					
			}
			
				
			
		}
		
		
	public static void main(String[] args) {
	ex04();

	}

}
