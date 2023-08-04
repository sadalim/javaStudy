package com.bizpoll.oop.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample2 {
	public static void main(String[] args) throws Exception {

		OutputStream os= new FileOutputStream("D:/test.txt");
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			
			os.write(data[i]);
			
		}
		
		os.flush(); // 잔여 데이터 추출
		os.close(); // 자원반납
		
	}
}
