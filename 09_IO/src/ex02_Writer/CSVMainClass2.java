package ex02_Writer;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVMainClass2 {

	
	public static void ex01() {
		
		Map<String, Object> pro1 = new HashMap<String, Object>();
		pro1.put("model", "아이폰");
		pro1.put("maker", "애플");
		pro1.put("price", "10");
		//System.out.println(pro1);
		
		Map<String, Object> pro2 = new HashMap<String, Object>();
		pro2.put("model", "플립");
		pro2.put("maker", "삼성");
		pro2.put("price", "20");
		//System.out.println(pro2);
		Map<String, Object> pro3 = new HashMap<String, Object>();
		pro3.put("model", "뭐지");
		pro3.put("maker", "엘지");
		pro3.put("price", "30");
		//System.out.println(pro3);
		List<Map<String, Object>> pros1 = new ArrayList<Map<String, Object>>();
		pros1.add(pro1);
		pros1.add(pro2);
		pros1.add(pro3);
		
		System.out.println(pros1);
		
		File dir = new File("C:" + File.separator + "Patorage");
		if(dir.exists()!= false) {
			dir.mkdirs();
		}
		File file = new File(dir , "ex0101");
		
		
		try (FileWriter fw = new FileWriter(file)) {
			
			for(int i = 0 ; i<pro1.size(); i++) {
				Map<String, Object> pro = pro1.get(i);
				
			}
			
			
		}catch
	
	}
	public static void main(String[] args) {
		ex01();
		
	}
	
}