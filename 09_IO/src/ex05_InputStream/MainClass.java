package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ex04_OutPutStream.Person;

public class MainClass {
	
	//영상 참고 
	
	public static void ex01() {
		
		File file = new File("C:" + File.separator + "storage", "ex01.bin");
		
		FileInputStream fis = null;
	try {
		fis = new FileInputStream(file);
		
		//입력단위 
		//1. int : 1개
		//2. byte[] " 2개이상 
		
		int c = 0; //하나씩 읽어들이기
		StringBuilder sb = new StringBuilder();
		while((c = fis.read())!= -1) {
				sb.append((char)c);
		}
		System.out.println(sb.toString());
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
		if(fis != null) {
			fis.close();
		}
		
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	}
	
	
	public static void ex02() {
		
		//원래 깨져서 출력됨(바이트 스트림과 한글 처리의 문제 확인)
		//추가로 다시 볼 것 
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			byte[] b = new byte[4]; //한번에 4바이트를 읽어 오시오
			int readByte = 0;//실제로 4바이트를 못 읽을 수 있으니 읽은 byte를 저장해 주세요 
			StringBuilder sb = new StringBuilder();
			
			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b, 0, readByte));
				}
				//배열 b의 인덱스 0부터 readByte개 데이터를 사용 
			System.out.println(sb);
			
			
			}catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
		}
		
	}
	
	public static void ex02_complete() {
		
		//한글 변환 스트림 
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			
			isr = new InputStreamReader(new FileInputStream(file));
			//읽어들이는 단위가 byte가 아닌 char이 됨 
			
			
			char[] cbuf = new char[4]; //한번에 4글자를 읽어 오시오
			int readCount = 0;//실제로 4글자를 readCount에저장하겠다 
			StringBuilder sb = new StringBuilder();
			
			while((readCount = isr.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount); //배열 cbuf 인덱스 0부터 readCount개 데이터를 사용
				}
				//배열 b의 인덱스 0부터 readByte 개 데이터를 사용 
			System.out.println(sb);
			
			
			}catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			try {
				if(isr != null) {
					isr.close();
				}
			}catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
		}
		
	}
	
		
		
	 public static void ex03() {
		 
		 
		 File file = new File("C:" + File.separator + "storage", "ex03.bin");
		 
		 BufferedInputStream bis = null;
		 try {
			 
			 bis = new BufferedInputStream(new FileInputStream(file));
			 
			 byte[] b = new byte[4];
			 int readByte = 0;
			 StringBuilder sb = new StringBuilder();
			 
			 while((readByte = bis.read(b))!= -1) {
				 sb.append(new String(b,0,readByte));
				 
				 System.out.println(sb.toString());
			 }
		 }catch (IOException e) {
			e.printStackTrace();	
			}finally {
				try {
					
				if(bis != null) {
					bis.close();
				}
			}catch(IOException e){
			e.printStackTrace();	
			}
	 }
			 
}
		 
	 public static void ex03_complete() {
		 
	 File file = new File("C:" + File.separator + "storage", "ex03.bin");

	 //버퍼 기반으로 읽기 
 		// FileInputStream fis = null;
		 BufferedReader br = null;
		 
		 try {
			 
			 br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			 //byte 스트림일때 자주 보이는 패턴 
			 //속도만 빠른게 아니라 한줄씩 읽어들이는 readline을 가질 수 있음 
			 
			 String line = null;
			 StringBuilder sb = new StringBuilder();
			 
			 while((line = br.readLine()) != null ) {
				 sb.append(line + "\n");
			 }
			 System.out.println(sb.toString());
		 }catch (IOException e) {
			e.printStackTrace();	
			}finally {
				try {
					
				if(br != null) {
					br.close();
				}
			}catch(IOException e){
			e.printStackTrace();	
			}
	 }
			 
}
	 
	 public static void ex04() {
		 
		 //String name,int age , double height, boolean iasAlive 순으로 값이 저장된 ex04.dat 파일
		 
		 File file = new File("C:" + File.separator + "storage","ex04.dat");
		 DataInputStream dis = null;
		 
		 try {
			 dis = new DataInputStream(dis);
			 
			//입력(변수 타입에 따라서 메소드가 다름)
			 String name = dis.readUTF(); //Write UTF에 대응
			 int age = dis.readInt();//WriteInt
			 double height = dis.readDouble();//WriteDouble
			 boolean iasAlive = dis.readBoolean();//WriteBoolean
			 
			 System.out.println(name);
			 System.out.println(age);
			 System.out.println(height);
			 System.out.println(iasAlive);
			 
		 }catch(IOException e) {
			 e.printStackTrace();
	
		 }finally {
			 try {
				 if(dis != null) {
					 dis.close();				 
					 }
			 }catch(IOException e){
				 e.printStackTrace();
			 }
		 }
				 
		 
		 
	 }
	 
	 
	 public static void ex05() {
		 //Person 객체가 3개 저장되어 있는(List<Person>2개, Person 1개) ex05.dat 파일
		 
		 File file = new File("C:" + File.separator + "storage","ex05.dat");
		 
		 ObjectInputStream ois = null;
		 try {
			 
			 ois = new ObjectInputStream(new FileInputStream(file));
			 
			 //입력
			 //readObject 메소드는 Object를 반환하므로 적절하게 캐스팅 해야 함 
			 @SuppressWarnings("unchecked")
			List<Person> people = (List<Person>)ois.readObject();
			 //자바가 정상적으로 처리를 못할 수 도 있어 괜찮아?
			 //안해도 상관은 없지만 경고 메세지가 거슬리는 사람은 눌러도 괜찮음
			 Person person = (Person)ois.readObject();
			 
			 System.out.println(people);
			 System.out.println(person);
			 
			 ois.close();
		 }catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
		 
	 }
public static void main(String[] args) {
	ex05();

	}

}
