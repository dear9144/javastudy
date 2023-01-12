package ex10_static;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//static 요소는 객체를 이용해서 호출할 수 있으나 
		// 권장하지 않음
		MyMath myMath = new MyMath();
		System.out.println(myMath.PI);
		
		
		MyMath yourMath = new MyMath();
		System.out.println(yourMath.PI);
			
		// static 요소는 클래스를 이용해서 호출하는 것이 권장이다.
		System.out.println(MyMath.PI);
		System.out.println(myMath.getCirclearea(1.5));
		System.out.println(myMath.max(1.1, 2.2 , 3.3));
		System.out.println(myMath.max(1.1, 2.2 , 3.3, 4.4));
		System.out.println(myMath.max(1.1, 2.2 , 3.3, 4.4, 5.5));
		System.out.println(myMath.min(1.1, 2.2, 3.3));
		System.out.println(myMath.min(1.1, 2.2, 3.3, 4.4));
		System.out.println(myMath.min(1.1, 2.2, 3.3, 4.4,5.5));
		
	}
	

}
