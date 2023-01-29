package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {
	
	//filereader
	//reader는 안 닫아도 잘 오류가 안남 
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file); //입력 스트림 이름 : fr
			
			int c;
			while((c = fr.read()) != -1) {
				System.out.println((char)c);
				
			
				}
			
			//System.out.println(sb.to());
				
			
		
		}catch(IOException e) { //FileNotFoundException이 함께 처리된다
			e.printStackTrace();
		}finally { //fr close를 위한 finally
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void ex02() { //잘 쓰는 방법 
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists()== false)  {
			dir.mkdirs();
		}
		File file = new File(dir,"ex02.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			char[] cbuf = new char[5]; //5글자를 읽어들이는 배열
			int readCount = 0; //실제로 읽은 글자의 개수
			StringBuilder sb = new StringBuilder();
			
			
			while((readCount = fr.read(cbuf)) != -1) {
				
				
				sb.append(cbuf, 0, readCount); //인덱스 0부터 readCount개 글자를 sb에 추가하시오 
				
				// ex02.txt 읽는 과정
				//루프	readCount		cbuf
				//1		5				a b c d e 
				//2		2				f g c d e
				//3		-1 : 읽을 수 없을때 -가 나오고 끝낸다는 의미
				
				 //readCount 읽은 글자 개수 
				
				//for(int i = 0; i <readCount; i++) {
					//System.out.println(cbuf[i]);
				//}
				
			
				
			} //while
		
			System.out.println(sb.toString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void ex03() {
		
		//BufferedReader : 읽는 속도가 빠른 
		//장점 노션
		
		
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists()== false)  {
			dir.mkdirs();
		}
		File file = new File(dir,"ex03.txt");
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line);
				
			}
			
			System.out.println(sb.toString());
			
			
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
