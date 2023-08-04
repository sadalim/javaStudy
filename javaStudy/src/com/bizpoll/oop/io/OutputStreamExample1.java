package com.bizpoll.oop.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample1 {
	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("D:/test.txt");
		byte[] data = "ABCDE".getBytes();

		os.write(data, 2, 3);

		os.flush(); // 잔여 데이터 추출
		os.close(); // 자원반납

	}
}
