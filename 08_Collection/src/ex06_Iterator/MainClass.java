package ex06_Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	
	public static void ex01() {
		/*
		 Iterator 인터페이스
		노션
		 */
		
		List<String> list = new ArrayList<String>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator(); //위가 String이니 타입 따라가야
		//리스트를 순회할 수 있는 반복자
		while(itr.hasNext()) {//리스트에 요소가 남아있으면 while을 돌리십시오 
			String food = itr.next();//음식 하나 꺼냄
			System.out.println(food);
		}
	} //결론 : for문 역할 
	
	public static void ex02() {
		Set<Integer> set = new HashSet<Integer>();
		//사용법은 같음 그러니 add사용
		set.add(5); //정수 저장 위와 같이
		set.add(15);
		set.add(105);
		
		//순회하기 위해 하나 더 생성
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) { //남으 데이터가 잇으면 while 실행
			Integer number = itr.next();
			System.out.println(number);
	
		}//결론 : set는 순서가 없다 
		
	}
	
	public static void ex03() {
		Map<String, Object> map =  new HashMap<String,Object>();//주로 사용하는 타입 
		//collection은 map을 포함하지 않는다 별도로 보기 때문에 add를 사용 안함
		//put 사용
		map.put("name", "신의정");
		map.put("age", "28");
		map.put("isAlive", "true");
		//주로 변수 이름으로 이용해서 쓰기 때문에 String 저장되는 값은 이것저것 다 (int,String등등)
		
		//key 값을 전달하는 방식을 기억
		Set<String> keySet = map.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		/*System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("isAlive"));
	*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex03();
	}

}
