package com.bizpoll.oop.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExamlpe3 {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("D:/test.txt");
			int readByteNo;
			byte[] readBytes = new byte[8];
			
			readByteNo = is.read(readBytes, 1, 4);
			
			for (int i = 0; i < readBytes.length; i++) {
				System.out.println((char)readBytes[i]);
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
