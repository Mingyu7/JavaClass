import java.net.*;
import java.io.*;

public class ServerSocketTest {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8111);
		System.out.println("Ŭ���̾�Ʈ ���� ����� ");
		Socket socket = serverSocket.accept();
		System.out.println("Ŭ���̾�Ʈ ����: " + socket);

		byte[] arr = {1,2,3,4,5,6,7,8,9,10};
		OutputStream out = socket.getOutputStream();
		out.write(arr);
	
		socket.close();
		serverSocket.close();
		out.close();
	}
}