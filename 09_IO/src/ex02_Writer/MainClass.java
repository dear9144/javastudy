package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	
	/*
	 스트림(stream)
	 
	 Writer
	 */
	
	public static void ex01() {
		//디렉터리 작업
		File dir = new File("C:" + File.separator + "starage");
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		
		//파일 작업
		File file = new File(dir, "ex01.txt");//저장될 파일 ,데이터는 저장 안됨
		
		//1. 선언으로 바꿈
		FileWriter fw = null; 
		try {
			fw = new FileWriter(file); //반드시 예외 처리가 필요한 코드
			
			//출력 스트림으로 문자 보내기
			int c = 'I';
			char[] cbuf = {' ','a','m'};
			String str = " a boy.";
			
			fw.write(c); //반드시 예외처리가 필요한 코드
			fw.write(cbuf);
			fw.write(str);
		
		
		
		System.out.println("ex01.txt 파일이 생성됨");
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) { //예외처리가 꼭 필요함 ,예외처리 했는데 왜 또 해야하나?
					//위 코드는 try에 있어야 하는데 없기 때문에 새로 만들어야 한다 
					fw.close();	
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
		
	public static void ex02() {
		/*
		 try - catch - resources문 
		 사용한 스트림을 자동으로 닫아주는 try문
		
		형식 
		try (스트림을 생성) {
			코드 
			}catch(Exception e) {
				e.printStackTrace();
			}
		 */ 
		
		File dir = new File("C:"+ File.separator + "strage");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		
		File file = new File(dir,"ex02.txt");
		
		try (FileWriter fw = new FileWriter(file)) { //스트림 생성 작업을 괄호 안에
		
			char[] cbuf = {'a','b','c','d','e'};
			String str = "abcde";
			
			fw.write(cbuf,0,2); //인덱스 0부터 2글자만 보내시오.
			fw.write(str, 2, 3);//인덱스 2부터 3글자만 보내시오
		}catch(IOException e) {
			e.printStackTrace();
		
		}
	
	}
	
	public static void ex03() {
		//BufferedWriter
		//노션 참고 
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		
		File file = new File(dir, "ex03.txt");
		//메인 스트림 선언
		
		FileWriter fw = null;
		
		//보조 스트림 선언
		BufferedWriter bw = null;
		
		
		try {
			
			//메인 스트림 생성
			fw  = new FileWriter(file);
			
			//보조 스트림 생성
			bw = new BufferedWriter(fw);
			
			//보조 스트림을 사용해서 문자 보내기
			
			bw.write("Hello World");
			
			System.out.println("ex03.txt 파일이 생성");
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				//보조 스트림을 사용한 경우에는 보조 스트림만 닫으면 메인 스트림도 함께 닫힌다.
				if(bw != null){
				bw.close();	}
				
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		
		
	}
	
	
	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "strage");
		if(dir.exists()== false) {
			dir.mkdir();
		}
		
		File file = new File(dir, "ex04.txt");
		
		//FileWriter fw ,  = null;
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("안녕하세요 반갑습니다");
			System.out.println("ex04.txt 파일이 생성되었습니다.");
		
		}catch(IOException e) {
		e.printStackTrace();
	
	}

}
	
	public static void ex05() {
		//PrintWriter 노션 참고 
		

		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex05.txt");
		
		PrintWriter out = null;
		
		try {
			
			out = new PrintWriter(file);
			
			// 자동 줄바꿈이 사용되는 println 메소드
			out.println("안녕하세요.");
			out.println("반갑습니다.");
			
			System.out.println("ex05.txt 파일이 생성되었다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			out.close();  // close 메소드 내부에서 이미 IOException을 처리하고 있다.
		}
		
	}
	
	//
	
	public static void main(String[] args) {
		ex05();
	}

}
