import java.io.*;
import java.net.*;

public class SimpleServer2 {

	
	public static void main(String[] args) throws Exception {
		ServerSocket sServerSocket = new ServerSocket(8222);
		System.out.println("Ŭ���̾�Ʈ ���� ����� ");
		Socket socket = sServerSocket.accept();
		System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");

		String str = "�������б� ����ƮIT�а�";
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(str);
		
		out.close();
		socket.close();
		sServerSocket.close();
		

	}

}
