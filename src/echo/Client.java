package echo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{
		
		Socket socket = new Socket();
		System.out.println("<클라이언트 시작>");
		System.out.println("========================================");
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("192.168.0.62", 10001)); //학원 컴퓨터 IP임. 
		
		System.out.println("[서버에 연결 되었습니다.]");
		
		//쓰기 스트림 - 메세지 보내기
		OutputStream out = socket.getOutputStream(); //socket 주스트림을 만들어서 달라고하면 됨
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("안녕");
		bw.newLine();
		bw.flush();// bufferedWriter에 자료가 꽉 차지 않아도 전송해달라.
	}

}
