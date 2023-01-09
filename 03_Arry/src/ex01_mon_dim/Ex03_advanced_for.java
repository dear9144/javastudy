package ex01_mon_dim;

public class Ex03_advanced_for {
		
	
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
				 
				 //[0]~[4] scores값을 순차적으로 n에 넣겠습니다
				 // int [0] = 50
				 // int [1] = 90
				 // int [2] = 60
				 // int [3] = 100	
				 // int [4] = 80
				 
				 
				 System.out.println(total);
			
		}
		
				public static void ex02() {
					
					String[] files = {"hello.txt","hi,txt","안녕.txt"};
					for(String file : files) {
						System.out.println(file);
						
					}
					
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
