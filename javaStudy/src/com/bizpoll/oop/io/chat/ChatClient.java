package com.bizpoll.oop.io.chat;

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		Socket sock = null;
		try {
			sock = new Socket("192.168.4.196", 9999);
			Thread st = new SenderThread(sock);
			st.start();
			Thread rt = new ReciverThread(sock);
			rt.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}