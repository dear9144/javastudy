package ex07_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	public static void printList(List<Integer> list) { //list를 대상으로 for문 돌리면 됨 
		
		int lastIndex = list.size() -1 ;
		for(int i = 0; i< lastIndex ; i++) {
			System.out.print(list.get(i) + "→"); //list의 요소를 가져온다 
		}
		
		//마지막 요소는 손 대지 말자 
		//i< list.size();이 부분을 수정할건데 1→~ 5 까지인걸 5를 출력을 안하겠다 
		
		System.out.println (list.get(lastIndex)); //마지막요소는size -1 , 길이니까
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,2,3,1,4);
		
		printList(list); //5-2-3-1-4
		
		Collections.sort(list); //오름차순 정렬 
		
		printList(list); //5-2-3-1-4
		
		int idx = Collections.binarySearch(list, 2); //이진검색
		//없는 데이터를 찾으라고 하면 - 즉, 음수로 나옴 
		if(idx >= 0) {
			System.out.println("찾았다");
		}else {
			System.out.println("못 찾았다");
		}
	}

}
