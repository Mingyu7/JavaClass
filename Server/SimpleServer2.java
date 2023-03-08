import java.io.*;
import java.net.*;

public class SimpleServer2 {

	
	public static void main(String[] args) throws Exception {
		ServerSocket sServerSocket = new ServerSocket(8222);
		System.out.println("클라이언트 연결 대기중 ");
		Socket socket = sServerSocket.accept();
		System.out.println("클라이언트 연결 완료");

		String str = "유원대학교 스마트IT학과";
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(str);
		
		out.close();
		socket.close();
		sServerSocket.close();
		

	}

}
