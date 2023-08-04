package com.bizpoll.oop.io.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sock = null;
		
		try {
			ss = new ServerSocket(9999);
			System.out.println("서버가 구동중입니다.");
			sock = ss.accept(); // 외부의 소켓 접속 요청 대기
			
			// 보내는 Thread(키보드로부터 데이터를 읽어서 보내는 작업)
			Thread st1 = new SenderThread(sock);
			st1.start();
			
			// 받는 Thread
			Thread rt1 = new ReciverThread(sock);
			rt1.start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}