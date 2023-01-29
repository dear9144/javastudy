package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XMLMainClass {
	//XML 노션 참고
	/*경로
	 ㅊ:\storage\product.xml
	 내용
	 <products>
	 	<product>
	 		<model>세탁기</model>
	 		<maker>삼성</maker>
	 		<price>100</price>
	 	</product>
 		<product>
	 		<model>냉장고</model>
	 		<maker>LG</maker>
	 		<price>200</price>
	 	</product>
	 	<product>
	 		<model>TV</model>
	 		<maker>삼성</maker>
	 		<price>300</price>
	 	</product>
	</products>
	 */

	public static void main(String[] args) {
		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model","세탁기");
		product1.put("maker","삼성");
		product1.put("price",100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model","냉장고");
		product2.put("maker","Lg");
		product2.put("price",200);
		
		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model","TV");
		product3.put("maker","삼성");
		product3.put("price",300);

		List<Map<String, Object>> productList = Arrays.asList(product1, product2, product3);
		
		try {
			//Document 생성(Document 는 XML문서 자체 의미)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			//builder가 DocumentBuilder 다큐먼트 만드는 사람 
			Document document = builder.newDocument();
			document.setXmlStandalone(true); //standalone = "no" 제거하기
			
			// <products> 태그 : Element 생성
			Element products = document.createElement("products");
			//지금까진 만들기만 한 것 이제 자식으로 집어 넣을 것 
			document.appendChild(products); //자식 생성
			
			// productList 순회
			for(Map<String, Object> map : productList) { //향상for문 사용 
				Element product = document.createElement("product");
				products.appendChild(product);
				
				//<model> 태그 : Element 생성
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent((String)map.get("model")); //텍스트 콘텐트
				
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent((String)map.get("maker"));
			
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent((int)map.get("price") + "");
				//스트링으로만 넘겨야 하기 때문에 int는 안됨 
				
				
				// XML 설정
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty("encoding", "UTF-8");
				transformer.setOutputProperty("indent", "yes");  // 들여쓰기
				transformer.setOutputProperty("doctype-public", "yes");  
				// standalone = "no" 제거하기 위해서 document.setXmlStandalone(true);를 
				// 추가하면 개행(줄바꿈)이 안 되므로 추가한 코드
				
				// XML 문서 만들기
				File dir = new File("C:" + File.separator + "storage");
				if(dir.exists() == false) {
					dir.mkdirs();
				}
				File file = new File(dir, "product.xml");
				Source source = new DOMSource(document);
				StreamResult streamResult = new StreamResult(file);
				transformer.transform(source, streamResult);
			
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
