import java.net.*;
import java.io.*;
import java.util.Arrays;

public class SocketTest{

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8111);
		System.out.println("연결완료" + socket);

		InputStream in = socket.getInputStream();
		byte[] basket = new byte[10];
		in.read(basket);
		System.out.println(Arrays.toString(basket));

		in.close();
		socket.close();
	}
}