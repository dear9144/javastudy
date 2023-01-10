package ex01_one_dim;

public class Ex03_advanced_for {
		
	//향상 for문
		public static void ex01() {
			
			int[] scores = {50,90,60,100,80};
			
				 int total = 0;
				 int max = 0;
				 int min = 100;
				 for(int n : scores) {
					 total += n;
					 if(max < n ) {
						 max = n;
					 }
					 if(min > n) {
						 min = n;
					 }
				 
				 }
				 // int n : scores의 의미 scores 
				 //[0]~[4] scores값을 순차적으로 n에 넣겠습니다
				 // scores [0] = 50
				 // scores [1] = 90
				 // scores [2] = 60
				 // scores [3] = 100	
				 // scores [4] = 80
				 
				 
				 System.out.println(total);
			
		}
		
				public static void ex02() {
					
					String[] files = {"hello.txt","hi,txt","안녕.txt"};
					for(String a : files) {
						System.out.println(a);
						
					}
					 
					
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
