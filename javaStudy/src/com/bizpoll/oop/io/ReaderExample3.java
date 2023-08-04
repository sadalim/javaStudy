package com.bizpoll.oop.io;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("D:/test.txt");

		int readCharNo;
		char[] cbuf = new char[10];
		readCharNo = reader.read(cbuf, 0, 10);
		
		for (int i = 0; i < cbuf.length; i++) {
			System.out.print(cbuf[i]);
		}
		reader.close();
	}

}
