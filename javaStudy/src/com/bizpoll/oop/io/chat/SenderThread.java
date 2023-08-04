package com.bizpoll.oop.io.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

// 보내는 스레드
public class SenderThread extends Thread {

	Socket sock;
	
	public SenderThread(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		try {
			// 키보드로부터 라인단위로 읽어들이는 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// 출력할 한글 깨짐 방지
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream(), "UTF-8"), true);
			while (true) {
				String msg = br.readLine();
				if (msg.equals("bye")) {
					break;
				}
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sock.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
