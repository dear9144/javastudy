package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClass2 {
	
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "Patorage");
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(file);
			
			String a = ("I am");
			char[] cbuf = {' ','h','a'};
			String str = "ppy";
			
			fw.write(a);
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("ex01.txt파일이 생성되었습니다");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) {
					fw.close();
				}
				}catch (IOException e) {
					e.printStackTrace();// TODO: handle exception
				}
			}
		}
		
	public static void ex02() {
		
		File dir = new File("C:" + File.separator + "Patorage");
		File file = new File(dir, "ex02.txt");
		
		
		try (FileWriter fw = new FileWriter(file)) {

			int a = 'C';
			char[] cbuf = {'a','f'};
			String d = "eLatte";
			
			fw.write(a);
			fw.write(cbuf);
			fw.write(d);
					
			}catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
	
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "Patorage");
		if(dir.exists() != false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		//FileWriter fw = null;
		//BufferedWriter bw = null;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("스타벅스는 맛잇어");
			System.out.println("ex03.txt 파일이 만들어졌습니다");
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		
		
		
	}
	
	
	//질문 
	public static void ex04() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] txt = new String[5];
		System.out.println("문장을 입력 하시오 >>>");
		for(int i = 0; i<txt.length; i++) {
			txt[i] = sc.nextLine();
		}
		File dir = new File("C:" + File.separator +"Patorage");
		if(dir.exists()== false) {
			dir.mkdirs();
		}
		File file = new File(dir,"ex04.txt");
		
		PrintWriter pw = null;
	
		try {
			pw = new PrintWriter(file);
			for(int i = 0 ; i<txt.length; i++) {
				pw.println(txt[i]);
			}
			System.out.println("ex04.txt 파일이 생성되었습니다");
			
		}catch (IOException e) {
			e.printStackTrace();
		}	
		sc.close();
	}
	
	
	public static void main(String[] args) {
		ex04();

	}

}
