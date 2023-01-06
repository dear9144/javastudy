package ex01_branch;

public class Ex02else {
	
	
	

	public static void main(String[] args) {
		

		// 앞서 쓴 분기문은 효율이 떨어짐 
		// tab 키의 반대는 shift + tab 그럼 왼쪽으로 tab 범위 만큼 이동
		// 앞서 쓴 분기문을 쓸때는 else 를 지원 안할 때 쓰고 그 외엔 else 문을 씀 
		
		int score = 80;
		
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다."); 	
		}
			
		
		else {
			System.out.println("불합격");
			System.out.println("보충수업입니다.");
		}

	}

}
