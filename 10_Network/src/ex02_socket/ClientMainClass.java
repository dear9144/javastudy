package ex02_socket;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;


public class ClientMainClass {


	public static void main(String[] args) {
		
		//Socket 노션
		
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			//InetSocketAddress :접속할 서버의 정보를 이용해서 생성 
			InetSocketAddress address =  new InetSocketAddress("localhost", 9090);
			
			socket.connect(address); //IOException 처리 필요 
			System.out.println("클라이언트 접속 성공ლ( ❛ ◡ ❛ ლ) ");
		
			//서버가 보낸 welcome 메시지 확인하기 
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String welcomeMessage = in.readUTF();
			System.out.println("[클라이언트]" + welcomeMessage);
			
			//서버에게 메세지 보내기 
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			out.write("반갑습니다!");
			
			//스트림 종료
			out.close();
			in.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket.isClosed()== false) {
					socket.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		}
	}

}
