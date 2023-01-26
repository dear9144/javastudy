package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CSVMainClass {

	public static void main(String[] args) {
		//CSV 노션 정리 
		
		
		
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
		
		//ArrayList 저장
		
		//List<Map<String, Object>> products = Arrays.asList(product1, product2,product3);
	
		List<Map<String, Object>> products = new ArrayList<Map<String,Object>>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		
		
		

		/*목표
		1. 경로
		C:\storage\product.csv
		2. 내용
			세탁기, 삼성, 100
			냉장고, Lg, 200
			TV,삼성,300
		
		*/
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "product.csv");
		

		try(PrintWriter out = new PrintWriter(file)) {
			
			for(int i = 0; i< products.size(); i++) {
				Map<String,Object> product = products.get(i); //array에 있는거 꺼내는  get
				out.println(product.get("model") + "," + product.get("maker") + "," + product.get("price"));
			}
		
		}catch(IOException e) {
		e.printStackTrace();
	
	}

}
		
		
	
	
	}

