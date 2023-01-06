package ex01_branch;

public class Ex03_else_if {

	
	
	public static void ex01() {
		
		//합격과 불합격의 기준으 ㄹ더 세분화 해볼것
		// 80이상 상
		// 60이상 중
		// 나머지 하
		int score = 80;
  		
		if(score >= 80) {
			System.out.println("상");
		}
		
		
		else if	(score >= 60) {
				System.out.println("중");
		}
		
		else {
			System.out.println("하");
		}
	

		// if가 많이 나올 것 같다면 else if 를 쓰면 됨 
	}
	
	
	public static void ex02() {
		
		int score = 100;
		//수 우 미 양 가 90 80 70 60 나머지 , 잘못된 점수 (100점이 넘었거나 0점이 나오거나)
		if(score <= 0 || score >= 100) {
		//if (score != 100 | score>= 90) {
		System.out.println("잘못된 점수입니다.");
		
		// || 그리고 와 |의 차이 알기 
		
		}
		else if (score >= 90) {
			System.out.println("수");
			
		}
		
		else if (score >= 80) {
		System.out.println("우");
		
		}
				
		else if (score>= 70) {
			System.out.println("미");
			}
		else if (score>= 60) {
			System.out.println("양");
		}
		else if (score>= 50) {
			System.out.println("가");
		}
		
		else {
			System.out.println("나머지");
		
		
		}
		
		
	}

	
	
	public static void ex03() {
		
		//나누기 연산으로 모듈라 연산 반복적인 것들은 퍼센트나 나눗셈을 잘 활용하면 됨 
		//
		int month = 1;
		int mod = month %12;
		
		if(mod <=2) {
		//if(month = 1 || score <= 11 >= 12) {
		// 12,1,2를 12로 나눠 나머지를 구하면 0 1 2
		// 12로 나눠서 작은 숫자는 무조건 나머지가 나눈 숫자로 나오니까..
		System.out.println("겨울");
		}
		
		else if (mod <=5) {
			//if(month = 1 || score <= 11 >= 12) {
			// 12,1,2를 12로 나눠 나머지를 구하면 0 1 2
			System.out.println("봄");
		}
		
		else if (mod <= 8) {
			//if(month = 1 || score <= 11 >= 12) {
			// 12,1,2를 12로 나눠 나머지를 구하면 0 1 2
			System.out.println("여름");
		}
		
		else {
			//if(month = 1 || score <= 11 >= 12) {
			// 12,1,2를 12로 나눠 나머지를 구하면 0 1 2
			System.out.println("가을");
		}
		// 문제확인 
	
	}

	
	public static void ex04() {
		
		int day = 6;
		int nDay = 10; //10 일후 요일 맞추기
		int mod = day % 7;
		String weekName; // 월요일 나와야 함 
		
		//day += day +nDay ; 활용해서 쓰기 
		if(mod == 0) {
			weekName = "토";
					
		}
	
		else if(mod == 1) {
			weekName = "일";
		}
		
		else if(mod == 2) {	
			weekName = "월";
		}
		else if(mod == 3) {	
			weekName = "화";
		}
		else if(mod == 4) {	
			weekName = "수";
		}
		else if(mod == 5) {	
			weekName = "목";
		}
		else {	
			weekName = "금";
		}
		
		System.out.println(nDay + "일 후는 " + weekName + "요일이다");
		
	}
		
		
	
	public static void main(String[] args) {
		ex02();
		
		
		// 문제 안 풀리는건 괜찮음...

	}

}
