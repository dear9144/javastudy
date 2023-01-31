package ex04_OutPutStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	
	public static void ex01(){
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex01.bin"); //bin - 이진 파일 
		
		FileOutputStream fos = null;
		//try catch 를 위해 선언만
		
		try {
			
			fos = new FileOutputStream(file);
			
			//출력단위 //노션
			int c = 'A';
			String str = "pple"; //바이트 배열로 변환할 스트링을 준비 ,바로는 못 보냄
			byte[] b = str.getBytes(); 
			
			//출력
			fos.write(c);
			fos.write(b);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//한글 데이터 보내기 - 인코딩 지정
	public static void ex02() {
		
		File dir = new File("C:" + File.separator + "storage" );
		File file = new File(dir, "ex02.bin"); //bin - 이진 파일 
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			String str = "안녕하세요";
			
			//getBytes(Charest charset) - 이 버젼으로 만든 것 
			byte[] b = str.getBytes(StandardCharsets.UTF_8);//* utf8로 인코딩해서 만들어주세요 
			
			/*getBytes(String charsetName)
			byte[] b = str.getBytes("UTF-8);
			만약 getBytes char가 안된다면 String을 사용하면 됨 
			*/
			
			fos.write(b);
			
			
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ex02.bin 파일에 크기: " + file.length()+ "바이트");
		
	}//UTF는 한글자에 3byte 
	
	
	public static void ex03 () {
		
		File dir = new File("C:" + File.separator + "storage" );
		File file = new File(dir, "ex03.bin"); 
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
		
			bos = new BufferedOutputStream(new FileOutputStream(file)); //우리가 사용할 것 
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8")); //\n : 1byte
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(bos != null) {
				bos.close();
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ex03.bin 파일에 크기: " + file.length()+ "바이트");
	}
	
	public static void ex04 () {
		
		//변수를 그대로 출력하는 DataOutPutSteam
		//노션
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex04.dat");
		//확장자가 달라진다고 해도 데이터값이 달라지진 않음 
		
		DataOutputStream dos = null;
		
		try {
			
			dos = new DataOutputStream(new FileOutputStream(file));//버퍼와 동일
			
			//변수 준비
			String name = "에밀리";
			int age = 30;
			double height = 180.5;
			boolean isAlive = true;
			
			//출력(변수타입에 다라 메소드가 다름)
			
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive); 
			//boolean의 크기 결정은 jvm이 판단(자바버츄얼머신)
			//이론상으로는 1바이트지만 그때그때마다 다름 사이즈가 너무 작아서 
			
			dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ex04.bin 파일에 크기: " + file.length()+ "바이트");
		
	}
	
	public static void ex05() {
		//객체를 그대로 출력하는 ObjectOutPutStream
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir,"ex05.dat");
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			//출력할 객체 준비 
			List<Person> people = Arrays.asList(
				new Person("에밀리", 30, 180.5, true),
				new Person("제시카", 35, 190.5, true)
			);//한사람 출력도 가능
			
			//디폴트 생서자 + set
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
		
			
			//출력
			oos.writeObject(people);
			oos.writeObject(person);
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) {
					oos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		}System.out.println("ex05.bin 파일에 크기: " + file.length()+ "바이트");
	}
	
	public static void main(String[] args) {
		ex05();

	}

}
