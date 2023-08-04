package com.bizpoll.oop.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExamlpe2 {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("D:/test.txt");
			int readByteNo;
			byte[] readBytes = new byte[3];
			String data = "";
			
			while (true) {
				readByteNo = is.read(readBytes);
			
			if (readByteNo == -1) {
				break;
			}
			
			data += new String(readBytes, 0, readByteNo);
			
			}
			System.out.println(data);
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
