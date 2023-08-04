package com.bizpoll.oop.io;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:/test.txt");
		
		int readData;
		
		while (true) {
			readData = reader.read();
			if (readData == -1) {
				break;
			}
			System.out.print((char)readData);
		}
		reader.close();
	}
	
}
