package ex05_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
	
	public static void ex01() {
		
		//HashMap
		//타입
		Map<String,Object> person = new HashMap<String, Object>();
		
		//추가 
		// put(Key, Value)
		person.put("name", "홍길동");
		person.put("age", 30);
		System.out.println(person);
		
		//수정 
		//put(Key,Value)
		person.put("age", 40); //기존 key와 동일한 키를 전달하면 해당 키값의 value가 수정된다.
		
		//삭제
		//remove (key)해당 키값의 엔트리를 지워줌 
		int age = (int)person.remove("age"); //삭제된 Value가 반환된다 Value는 오브젝트 타입이므로
		//캐스팅을 해야 사용 가능 
		System.out.println("삭제된 나이 : " + age);
		//확인 
		System.out.println(person);
		
	}

	
	public static void ex02() {
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("spring","봄");
		dictionary.put("summer","여름");
		dictionary.put("autumn","가을");
		dictionary.put("winter","겨울");
		
		//Value 가져오기
		//get(Key)
		String season = dictionary.get("winter");
		System.out.println(season);
		
	}
	
	
	public static void ex03() {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("spring","봄");
		dictionary.put("summer","여름");
		dictionary.put("autumn","가을");
		dictionary.put("winter","겨울");
		
		//1.키만 모두 가져온 뒤 해당 키값을 가진 벨류를 가져오기
		//key만 모두 가져오기 ,set를 쓸거임
		Set<String> keySet = dictionary.keySet();
		//향상 for문 쓸거임 
		for(String key : keySet) {
			System.out.println(key + ":" + dictionary.get(key));
		}
		
		//키만 모두 가져온 뒤 해당 키값을 가진 벨류를 가져오기 
		//2. entry를 모두 가져온뒤 키와 벨류로 분리하기 
		for(Entry<String, String> entry : dictionary.entrySet()) {
			//엔트리가 빠져나오는 거다 
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		
		
		
		
	}
	
	public static void ex04() { //연습
		
		//제목(title) 저자 (author) 가격(price)로 구성되는 책 (book) Hashmap
		Map<String, Object> book1 = new HashMap<String, Object>();
		book1.put("title","어린왕자");
		book1.put("author","생텍쥐베리");
		book1.put("price","10000");
		
		Map<String, Object> book2 = new HashMap<String, Object>();
		book1.put("title","성냥팔이소녀");
		book1.put("author","안데르센");
		book1.put("price","20000");
		
		Map<String, Object> book3 = new HashMap<String, Object>();
		book1.put("title","소나기");
		book1.put("author","황순원");
		book1.put("price","30000");
		
		
		
		//책 (book)3권이 저장된 ArrayList
		
		List<Map<String, Object>> books = new ArrayList<Map<String,Object>>();
		books.add(book1);
		books.add(book2);
		books.add(book3);

			
		//for 문 순회 
	
	for(int i = 0, length = books.size(); i < length; i++) {
		// Map의 순회(List에 저장된 요소가 Map이다.)
		Map<String, Object> book = books.get(i);// < books[i] books.get(i)
		System.out.println((i + 1) + "번째 책의 정보");
		for(Entry<String, Object> entry : book.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}

	public static void main(String[] args) {
		ex04();
	}

}
