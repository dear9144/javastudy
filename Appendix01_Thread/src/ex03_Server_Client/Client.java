package ex03_Server_Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

import jdk.internal.org.jline.utils.InputStreamReader;

public class Client extends Thread{
	
	
	
	private BufferedReader reader;// 서버 정볼 읽는 reader
	
	public Client(Socket socket) { //인풋 스트림에 리더를 끼워서 텍스트를 받아보겠다 
		//서버 정보가 담긴 socket이 넘어옵니다 
		try{reader = new BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
		
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
@Override
public void run() {
	
	try {
		
		while(true) {
			String message = reader.readLine();
			if(message.equals("굿바이")) { //서버가 굿바이를 보내면 클라이언트가 접속을 그만한다 
				break;
			}
			System.out.println(message);
	}
	}catch (IOException e) {
		e.printStackTrace();// TODO: handle exception
	}finally {
		try {
			reader.close();
			
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
	
	}//reader.readLine();	//서버는 클라이언트로 문장으 ㄹ보낸 뒤 엔터를 누른다 
}
