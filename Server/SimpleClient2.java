import java.io.*;
import java.net.*;
import java.util.Arrays;

public class SimpleClient2 {

	public static void main(String[] args) {
		Socket socket = new Socket("localhost", 8222);
		System.out.println("��������Ϸ�");

		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String msg =din.readUTF();
		System.out.println("���� �޽���: "+msg);
		
		din.close();
		in.close();
		
		socket.close();
		

	}

}
