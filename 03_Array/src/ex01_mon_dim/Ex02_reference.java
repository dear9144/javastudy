package ex01_one_dim;

public class Ex02_reference {


	
		public static void ex01() {
			
			int[] arr; 
			/*
			 arr
			 arr[0]
			 arr[1]
			 arr[2]
			 arr[3]
			 arr[4]
			 이렇게 변수자체는 "6개가 생겼다고 생각해야함"
			 */
			
			arr = new int [5];
			
			System.out.println(arr);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
		}
		
		// 도출되는 값 Sysyem.out.prinfln(arr); - [I@182decdb 값을 알아보자 
		
		public static void ex02() {
				int[] arr;
				
				arr = new int[5];
				System.out.println(arr); // 5개 배열 요소의 참조(주소,번지)값
				//[I@182decdb
				//@ 앞부분은 무시하고 뒷 부분이 참조값임 
				//string은 문자열 길이가 다 달라 참조 타입이 관리함 
				// 주소를 저장해 사용함 
				/*
	            |-------|
	          a | 0x123 |─────┐
	            |-------|          │
	            |  ...  |          │
	            |-------|          │
	       a[0] |   0   | 0x123    │
	            |-------|          │
	       a[1] |   0   |          │
	            |-------|          │
	       a[2] |   0   |          │ b = a;
	            |-------|          │
	       a[3] |   0   |          │
	            |-------|          │
	       a[4] |   0   |          │
	            |-------|          │
	            |  ...  |          │
	            |-------|          │
	          b | 0x123 |◀────┘
	            |-------|
			*/
				
		}
		
		public static void ex03() {
			
			int [] a = new int[5];
			int [] b; 
			
			b = a;
			System.out.println(b[0]);
			//배열의 이름에 참조를 저장 
		}
		
		public static void ex04() {
			//심화
			//생성된 배열의 크기를 늘이는 방법
			//원래는 불가능함 그러나 간혹 늘려야 하는 상황이 발생 
			// a가 5의 값을 가짐 근데 늘리고 싶음 
			//10개짜리를 새로 만듬 - a 가 가지고 있는 값을 b 로 복사하고 참조값을 물려받으면 됨 
			// 마치 늘린 것처럼 할 수 있음 
			
			int[] a = new int[5];
			int[] b = new int[10];
			
			//기존 배열 요소 =? 신규 배열 요소
			for(int i = 0; i <a.length; i++) {
				b[i] = a[i];
			}
			
			// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
			a = b;
			//기존 배열이 신규 배열로 변경되었으므로 확인 
			
			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			
			
		}
		
		// a 가 0x10 값을 가져 10번지로 이동을 하면 12345 (5개의)값을 가짐
		// a 가 0x20 값을 가져 20번지로 이동을 하여 1234500000(10개의)값을 가짐 
		// a 가 10번지에서 20번지로 이동하며 10번지에 있던 데이터들은 garbage라는 곳으로 감 = 메모리 누수 
		// 자바는 스스로 메모리 관리를 하기 때문에 굳이 메모리 관리를 할 필욘 없음 
		
		
		
	public static void main(String[] args) {
		ex04();
	}

}
