package com.bizpoll.oop.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExamlpe1 {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("D:/test.txt");
			int readByte;
			
			while (true) {
				readByte = is.read();
			
			if (readByte == -1) {
				break;
			}
			
			System.out.print(readByte + "=");
			System.out.print((char)readByte + ", ");
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
