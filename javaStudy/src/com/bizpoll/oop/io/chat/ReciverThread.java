package com.bizpoll.oop.io.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReciverThread extends Thread {

	Socket sock;
	
	public ReciverThread(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		try {
			// 입력한 한글 글자 깨짐 방지
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream(), "UTF-8"));
			while (true) {
				String msg = br.readLine();
				if (msg == null) {
					System.out.println("상대방과의 연결이 종료되었습니다.");
					break;
				}
				
				System.out.println("수신메세지 > " + msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}