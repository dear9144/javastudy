package ex06_op_string;

public class MainClass {
	
	
	public static void ex01() {
		
		//연결 연산
		// 문자열과 + 연산자가 만나면 문자열로 연결됩니다.
		
		String str1 = "구디" + "아카데미 ";
		String str2 = 4 + "달라";
		String str3 = 100 + 10 + "번지"; // a + b + c 가 이항 연산자인 이유 a+b 값이 c와 계산되니까
		
		
	
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
	}
	
	
	

	public static void ex02() {
		
		//"100" -> 100 , 100 -> "100" 으로 변환하는걸 할거임
		// 모든 타입의 데이터는 빈 문자열("")을 + 시키면 문자열이 됩니다.
		
		int a = 100;
		String str = "" + a ; // a를 문자열로 바꾸는 것 
		
		//원래는 이런게 있습니다.
		// String str = String.value0f(a);
		// 하지만 잘 안씀 너무 기니까 
		
		
		System.out.println(str);
		// 다시 확인해볼것 : "100"으로 변환 되었으나 "100" 으로 나오지는 않음 

		
	}
	
	
	public static void ex03() {
		
		
		//문자열의 비교는 == 또는 !=으로 하지 않는다.
		// 문자열에서 쓸 수 있는건 + 뿐이다. 
		
		String str1 = "hello";
		System.out.println(str1 == "hello"); //true , 근데 왜 쓰면 안되는가 ?
		
		String str2 = new String("hello");
		System.out.println(str2 == "hello"); //false , 이렇게 다르기 때문에 위의 경우를 쓰면 안됨 
		
		
		
	}
	
	public static void main(String[] args) {
		ex02();
		
		
	}

}
