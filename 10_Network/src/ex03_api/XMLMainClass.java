package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class XMLMainClass {
	
	public static void ex01() {
		//한국공항공사_항공기 운항정보 : 공항 코드 정보
		//서비스 URL :http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList 
		//요청 변수 (Request Parmeter)
		//1) SeviceKey : 인증키
 
		
		String SeviceKey = "q5aH9sfKYNWJ2n+L/zIyMJP/TMBfAaplNbPHZ2GTOe/WCs6ytjQzc9250eTk1/MILoJdDck1sJzYkG74pRv3cQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			apiURL += "?serviceKey=" + URLEncoder.encode(SeviceKey,"UTF-8");
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection(); //캐스팅 해야함 타입이 안 맞아서 
			
			//get방식 삼성전자 참고 
			con.setRequestMethod("GET"); //소문자로 적으면 안됨 
			//내가 받고자 하는 파일은 xml이다 
			con.setRequestProperty("Content-Type", "application/xmlcharset=UTF8");
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) { //HttpURLCONNECTION.HTTP_OK = 200을 더 많이 쓰긴 함 어제는 
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine())!= null) {
				sb.append(line + "\n");
			}//내려받는거 끝남
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage","공항코드정보.txt");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString()); 
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되었습니다.");
				
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void ex02() {
		//pageNo : 페이지 번호
		//schDate : 검색일자
		//schDEptCityCode : 출발도시코드
		//scArrvCityCode : 도착도시코드
		
		
		String ServiceKey = "q5aH9sfKYNWJ2n+L/zIyMJP/TMBfAaplNbPHZ2GTOe/WCs6ytjQzc9250eTk1/MILoJdDck1sJzYkG74pRv3cQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedWriter writer = null;
		BufferedReader reader = null;
		
		
		try {
			apiURL += "?serviceKey="+ URLEncoder.encode(ServiceKey,"UTF-8");
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20230201";
			apiURL += "&schDEptCityCode=ICN";
			apiURL += "&scArrvCityCode=JFK";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET"); //소문자로 적으면 안됨 
			//내가 받고자 하는 파일은 xml이다 
			con.setRequestProperty("Content-Type", "application/xmlcharset=UTF8");
			
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) { //HttpURLCONNECTION.HTTP_OK = 200을 더 많이 쓰긴 함 어제는 
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
			reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
		
			
			String line = null;
			
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}//내려받는거 끝남
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage","국제선운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString()); 
			writer.close();
			
			System.out.println("국제선운항스케줄.xml이 생성되었습니다.");
				
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
			
	public static void main(String[] args) {
		ex01();

	}

}
