package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainClass {
	
	//File 클래스 - 노션
	
	
	public static void ex01() {
		//File. separator : 플랫폼에 따라서 자동으로 경로 구분자를 사용함
		
		//디렉터리 관련 필수 작업 
		File dir = new File("C:" + File.separator + "separator"); // \사용시 \\입력할 것 
		//c드라이브 밑에 storage 폴더 의미 
		
		//없으면 만들고 있으면 지운다.
		if(dir.exists() == false) { //폴더가 없으면 
		dir.mkdirs(); //스토리지 만들것
		System.out.println("C:" + File.separator + "storage 생성 완료");
		}else {
			//dir.delete(); //delete : 지금 바로 지운다
			dir.deleteOnExit(); //jvm 실행이 끝나면지운다.
			System.out.println("C:" + File.separator  + "storage 삭제 완료");
		}
		
	}

public static void ex02() throws IOException {  // 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다.
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "myfile.txt");
		if(file.exists() == false) {
			file.createNewFile();  // 반드시 예외 처리가 필요한 코드
		} else {
			file.delete();
		}
		
	}
	
	public static void ex03() throws IOException {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "myfile.txt");
		
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		// 파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath());  // 파일명 + 디렉터리명
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		long lastModified = file.lastModified();  // 최종 수정일의 타임 스탬프
		System.out.println("최종 수정일 : " + lastModified);
		
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		System.out.println("최종 수정일 : " + lastModifiedDate);
		
		long size = file.length();  // 파일의 크기가 바이트 단위로 저장
		long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
		System.out.println("파일 크기 : " + kb + "KB");  // 킬로바이트 출력(1024바이트 = 1킬로바이트)
		
	}
	
	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "Program Files");
		
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {
				System.out.println(files[i].getName());
			}
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {  // main 메소드를 호출하는 곳으로 예외 처리를 넘긴다.(개발자가 try-catch 하지 않겠다.)
		ex03();
	}

}

