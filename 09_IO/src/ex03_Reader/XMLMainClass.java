package ex03_Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLMainClass {

	public static void main(String[] args) {
		//C:\storage\product.xml 읽기
		
		
		
		
				try {
			
			// Document 생성
			File file = new File("C:" + File.separator + "storage", "product.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);  // product.xml을 분석(파싱)한 Document 객체
			
			// 최상위 요소 : <products> 태그
			Element root = document.getDocumentElement();
			
			// 최상위 요소의 하위 태그들 : <product> 태그(Node는 Element와 거의 같은 의미)
			List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
			NodeList nodeList = root.getChildNodes();
			for(int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);  // node는 #text(줄바꿈을 의미)와 <product> 태그(Element를 의미) 중 하나이다.
				if(node.getNodeType() == Node.ELEMENT_NODE) {  // node가 <product> 태그인가?
					Map<String, Object> product = new HashMap<String, Object>();
					NodeList nodeList2 = node.getChildNodes();
					for(int j = 0; j < nodeList2.getLength(); j++) {
						Node node2 = nodeList2.item(j);  // node2는 #text(줄바꿈을 의미)와 <model>, <maker>, <price> 태그(Element를 의미) 중 하나이다.
						if(node2.getNodeType() == Node.ELEMENT_NODE) {  // node2가 <model>, <maker>, <price> 중 하나인가?
							String key = node2.getNodeName();  // key는 model, maker, price 중 하나이다.
							product.put(key, node2.getTextContent());
						}
					}
					products.add(product);  // ArrayList에 Map 추가하기
				}
			}
			
			System.out.println(products);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

		
		
		/*try {
			
			//Document 생성
			File file = new File("C:" + File.separator + "storage", "product.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);//파일 내용 읽어서 문서로 가져오는것
			
			//product.xml을 분석(파싱)한 Document 객체
			//최상위 요소 : <products>태그
			Element products = document.getDocumentElement();
			System.out.println(products.getNodeName());
			
			//최상위 요소의 하위 태그들: <product>태그
			List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
			NodeList nodelist = root.get();//Node는 Element와 거의 같은 의미
			for(int i = 0; i < nodelist.getLength(); i++) {
				Node node = nodelist.item(i);
				System.out.println(node.getNodeName()); //결과 - 노드가 6개 나옴 
				//#text는 줄바꿈의 의미 와 <product> 태그(element라고 함) 중 하나이다
			if(node.getNodeType() == Node.ELEMENT_NODE) { //ELEMENT니? = <product> 태그니?
				Map<String, Object> product = new HashMap<String, Object>();
				NodeList nodelist2 = node.getChildNodes();
				for(int j = 0; j <nodelist2.getLength(); j ++) {
					Node node2 = nodelist2.item(j);
					 //이 노드2는 #text는 줄바꿈의 의미	
					//<model>,<maker>,<price>태그(ELEMENT)의미 중 하나이다.
					if(node2.getNodeType() == Node.ELEMENT_NODE) {//노드2타입은 엘리먼트 노드랑 같니?
						String key = node2.getNodeName(); //key는 model,maker,price 중 하나
						product.put(key, node2.getTextContent());
						
						}
					}products.add(product);
				}
			
			}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
 
	}
*/
}
