package ex02_socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerMainClass {

	public static void main(String[] args) {
		
		//SeverSocket : 서버가 사용하는 Socket
		
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();//무조건 오류 나옴 IOException 처리가 필요 
			
			// InetSocketAddress : Socket 사용 시 "호스트(이름)","포트번호" 를 관리하는 class
			InetSocketAddress address = new InetSocketAddress("localhost", 9090);
			//완성되는 주소 localhost:9090
			//bind  : ServerSocket에 InetSocketAddress 정보 전달
			// localhost:9090이 서버 주소이다
			
			serverSocket.bind(address);
			
			//무한 루프로 serverSocket 구성
			while(true) {
				System.out.println("[서버] 클라이언트 접속을 기다리고 있습니다.٩( ᐖ )و  ");
				
				//클라이언트 접속 허락을 허용해주는 코드가 먼저 들어와야 함 
				Socket clientSocket = serverSocket.accept();
				
				//클라이언트 접속 확인을 위해서 InetSocketAddress를 활용
				InetSocketAddress clientAddress = (InetSocketAddress)clientSocket.getRemoteSocketAddress();
				//타입이 안맞으니까 오류 생기는 것(임 캐스팅 ~!
				System.out.println("서버 접속된 클라이언트 :" + clientAddress.getHostName());
				
				//클라이언트에게 welcome 메시지 보내기 
				DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream()); 
				// 접속한 클라이언트로 데이터를 보내는 출력 스트림
				out.writeUTF("[서버] 어서오세요 환영합니다  (*´▽｀*）");
				//writeUTF 메소드를 이용하면 바이트 스트림으로도 한글 깨짐 없이 데이터 보낼 수 있다
				
				//반갑습니다 받기 
				//DataInputStream in = new BufferedReader(new java.io.InputStreamReader(socket.getinputStream));
				BufferedReader in = new BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
				String line = null; //여러줄을 받아오기 위해
				StringBuilder sb = new StringBuilder();
				while((line = in.readLine()) != null) {
					sb.append(line + "\n");
				}
				System.out.println("[서버] :" + sb.toString());
				
				//스트림 종료
				out.close();
				in.close();
				//클라이언트 접속 종료 - 안 넣어도 되긴 함  
				clientSocket.close();
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
