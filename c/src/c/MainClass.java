package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry;

public class MainClass {
	
	
	public static void ex01() {
		
		//
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("-----");
		
		for(String season : list) {
			System.out.println(season);
		}
	}
	
	
	public static void ex02() {
		//map
	
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(10, "b");
		map.put(101, "c");
		map.put(11, "d");
		
		System.out.println(map);
		
	}
	
	public static void ex03() {
		String name = "제시카";
		String phone = "010";
		int age = 20;
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("name",name);
		map.put("phone",phone);
		map.put("age",age + "");
		System.out.println(map);
	}
	
	
	
	public static void ex04() {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("Service-Key", "kdjfhkaf");//포스트 상황이어서 (로그인창 생각하면 됨 )
		map.put("Content-Type", "application/xml");
		
		System.out.println(map.get("Service-Key"));
		System.out.println(map.get("Content-Type"));
		
		ex05(map);
		
	}
	
	public static void ex05(Map<String, Object> map) {
		
		for( java.util.Map.Entry<String, Object> entry : map.entrySet() ) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
			
			
		
		
		
	
	public static void main(String[] args) {
		ex04();

	}

}
