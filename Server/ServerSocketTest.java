import java.net.*;
import java.io.*;

public class ServerSocketTest {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("클라이언트 연결 대기중 ");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 연결: " + socket);

		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		OutputStream out = socket.getOutputStream();
		out.write(arr);
	
		socket.close();
		serverSocket.close();
		out.close();
	}
}