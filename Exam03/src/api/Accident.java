package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONObject;


public class Accident {

	public static void main(String[] args) {
		String serviceKey = "q5aH9sfKYNWJ2n+L/zIyMJP/TMBfAaplNbPHZ2GTOe/WCs6ytjQzc9250eTk1/MILoJdDck1sJzYkG74pRv3cQ==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		
		try {
			
			StringBuilder sbURL = new StringBuilder();
			//String occrrncDt = "발생월일시";
			String occrrncDayCd = "발생요일코드 ";
			//String dthDnvCnt = "사망자수";
			//String injpsnCnt = "부상자수 ";
			
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&returnType=json");
			sbURL.append("&occrrncDt=2019011622" + URLEncoder.encode(occrrncDayCd, "UTF-8"));
			sbURL.append("&dthDnvCnt=0");
			sbURL.append("&injpsnCnt=1");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			System.out.println(sb.toString());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
