package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MainClass {
	/*
	 URL
	 노션 
	 */
	
	public static void ex01() {
		
		String apiURL = "https://search.naver.com/search.naver?query=삼성전자"; 
		//클래스 이름이 URL
		URL url = null;
		
		try {
			url = new URL(apiURL); // 반드시 예외처리 필요한 코드
			
			System.out.println("프로토콜 :" + url.getProtocol());
			System.out.println("호스트 :" + url.getHost());
			System.out.println("파라미터 :" + url.getQuery());
			
		}catch(MalformedURLException e) {
			System.out.println("api URL 주소 오류");
			
		}
		
	}
	
	public static void ex02() {
		
		// 웹 접속을 담당하는 HttpURLConnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL); // MalformedURLException 처리가 필요 
			con = (HttpURLConnection)url.openConnection(); //IOException 처리 필요 
			//타입 문제가 있기 때문에 캐스팅 해줘야 함 
			
			
			// HTTP 응답 코드 공부 
			
			System.out.println("정상 응답 :" + HttpURLConnection.HTTP_OK);
			System.out.println("Not Found :" + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error :" + HttpURLConnection.HTTP_INTERNAL_ERROR);
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				System.out.println(apiURL + "접속 완료");
			}
			
			// 요청방식(요청 메소드)
			String requestMethod = con.getRequestMethod();
			System.out.println("요청 방식 :" + requestMethod);
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 :" + contentType);//contentType - 웹상에서 사용하는 타입 
			
			
			//요청 헤더 
			String userAgent = con.getRequestProperty("User-Agent");
			System.out.println("User - Agent :" + userAgent);
			
			String referer = con.getRequestProperty("referer");
			System.out.println("referer :" + referer); //이전 주소가 나옴 
			
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch(IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
		//접속 종료 
		con.disconnect();//생략해도 되긴 함 
		
	}
	
	public static void ex03() {
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedInputStream in = null;    // Daum 로고를 읽어 들이는 입력 스트림
		BufferedOutputStream out = null;  // C:\storage\daum.png로 내보내는 출력 스트림
		File file = new File("C:" + File.separator + "storage", "daum.png");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				
				in = new BufferedInputStream(con.getInputStream());
				out = new BufferedOutputStream(new FileOutputStream(file));
				
				byte[] b = new byte[10];
				int readByte = 0;
				
				while((readByte = in.read(b)) != -1) {
					out.write(b, 0, readByte);
				}
				
				System.out.println("다운로드 완료");
				
				out.close();
				in.close();
				con.disconnect();
				
			}
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			// 접속 실패 또는 스트림 관련 오류
			e.printStackTrace();
		}
		
	}
	public static void ex04() {
		
		//버퍼 장착
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedInputStream in = null; //Daum 로그를 읽어 들이는 입력 스트림 
		BufferedOutputStream out = null; //C:\storage\daum.png로 내보내는 출력 스트림 
		File file = new File("C:" + File.separator + "storage" + File.separator + "daum.png");
		
		try{
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK); {//접속 되었다면 작업을 수행하겠다 
				
				//스트림 두개 준비 완료
				in = new BufferedInputStream(con.getInputStream());
				out = new BufferedOutputStream(new FileOutputStream(file));
				//파일 클래스 없이 진행 
				
				byte[] b = new byte[10];
				int readByte = 0;//10 바이트를 읽기로 했으나 실제론 10바이트가 아닐 수도 있으니
				
				while((readByte = in.read(b)) != -1) {
					out.write(b, 0, readByte);
				}
				System.out.println("다운로드 완료");
				out.close();
				in.close();
				con.disconnect();
			}//con = connection 뜻 
			
			
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}catch(IOException e) {
			//접속 실패 또는 Stream관련 오류 
			e.printStackTrace();
		}
		
		
	}
	
	public static void ex05() {
		//문서 내려받기
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
		InputStreamReader reader = null;
		FileWriter writer = null;
		File file = new File("C:" + File.separator + "storage","다운로드문서.txt");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new InputStreamReader(con.getInputStream());
				//byte 기반의 stream이 제공되면 그걸 이제 Char 기반의 Stream으로 바꿔주는
				//과정이 이것 
			}else {
				reader = new InputStreamReader(con.getErrorStream());
			}
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[2];
			int readCount = 0;
			
			while((readCount = reader.read(cbuf))!= -1) {
				sb.append(cbuf, 0, readCount);
			}
			
			writer = new FileWriter(file);
			writer.write(sb.toString());
			
			writer.close();
			reader.close();
			con.disconnect();
			
			System.out.println("다운로드 완료");
			
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
	
		
	}
	
	public static void ex06() {
		
		//버퍼 끼우기 해보기 ,아직 수행 안함, 깃허브 볼것  
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = new File("C:" + File.separator + "storage","다운로드문서.txt");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				//byte 기반의 stream이 제공되면 그걸 이제 Char 기반의 Stream으로 바꿔주는
				//과정이 이것 
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[2];
			int readCount = 0;
			
			while((readCount = reader.read(cbuf))!= -1) {
				sb.append(cbuf, 0, readCount);
			}
			
			//writer = new BufferedWriter(file);
			writer.write(sb.toString());
			
			writer.close();
			reader.close();
			con.disconnect();
			
			System.out.println("다운로드 완료");
			
		}catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex07() {
		/*
		 인코딩(암호화)
		 노션 참고 
		 
		 */
		String data = "한글 english 12345 !@#$%%";
		
		try {
			//인코딩 
			String encodeData = URLEncoder.encode(data, "UTF-8");
			System.out.println(encodeData);
			
			//디코딩
			String decodeData = URLDecoder.decode(encodeData, "UTF-8");
			System.out.println(decodeData);
			
		}catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 실패");
		}
	}
	
	public static void main(String[] args) {
		ex07();

	}

}
