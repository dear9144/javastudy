package ex03_Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void ex01() {
		
		//HashSet 객체 선언 및 생성
		
		Set<String> set = new HashSet<String>();

		//추가
		set.add("spring");
		set.add("spring");
		set.add("spring");
		set.add("summer");
		set.add("autumn");
		set.add("winter");
		
		//제거
		set.remove("winter");

		//확인
		System.out.println(set);

		}

	
	

	public static void ex02() {
		//Hashshot 향상 for문으로 접근
		//초기화 (list를 이용해서 초기화 진행)
		//커스텀 타입만 
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		
		//인덱스가 없기 때문에 향상for문만 가능
		for(Integer n : set) {
			System.out.println(n);
		}
		
	
		
	}

	public static void ex03()	{
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5,6,7));
		
		//교집합
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		
		
	}
	
	public static void ex04() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합
		set1.addAll(set2);  // set1에 합집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
		
		
	}
	
	public static void ex05() {

		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 차집합
		set1.removeAll(set2);  // set1에 차집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
	}
		
	public static void ex06() {
		Set<Integer> lotto = new HashSet<Integer>();
		
		//1~45 : 6개 랜덤 
		while(lotto.size() < 6) {
			lotto.add((int)Math.random()* 45 + 1);
		}
		
		System.out.println(lotto);
		
	}
	
	
	
	public static void main(String[] args) {
	
	
		ex06();
	

}
}