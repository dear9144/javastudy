package ex01_branch;

public class Ex01_if {

	
	public static void ex01() {
	
		// if 문
		int score = 60;
	
		if(score >= 60)
		System.out.println("합격");
	
		if(score < 60)
		System.out.println("불합격");
	
	
	
	}
	
	
	public static void ex02() {
		
		//if 문의 중괄호
		//실행문이 1개인 경우 생략할 수 있음 일반적으로는 쓰는편이니 통상적으론 쓰는 편이 
		//실행문이 2개이상인 경우 반드시 필요하다.
		
		int score = 50;
		
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다."); 	
		}
		//	if(score >= 60); {
		//System.out.println("합격");
		//System.out.println("축하합니다."); 	
	   //}   - 이렇게 만약 ~~ 하고 세미콜론을 쓴다면 60이상이면 그 후 조건을 안 쓴 거나 마찬가지 문법적으로 오류는 없음
		
		if(score < 60)
			System.out.println("불합격");
			System.out.println("보충수업입니다.");
			
			//축하합니다 불합격 보충수업입니다.
			//이처럼 합격 축하합니다 두가지가 나올 수 있게 하려면 중괄호를 써야함 
			//if문의 적용 문장은 기본 1줄만 가능 , 2줄을 하려면 중괄호 
			
		
		
		
		
	}
		
	public static void main(String[] args) {
		ex02();
		
		
		
	
	}

}
