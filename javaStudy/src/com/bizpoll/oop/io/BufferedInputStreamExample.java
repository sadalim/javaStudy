package com.bizpoll.oop.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {

		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("D:\\Temp\\Dir\\img_copy_sample.png");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {

		}
		end = System.currentTimeMillis();

		System.out.println("버퍼를 사용하지 않았을 때 : " + (end - start) + "m/s");
		fis1.close();
		FileInputStream fis2 = new FileInputStream("D:\\Temp\\Dir\\img_copy_sample.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {

		}
		end = System.currentTimeMillis();System.out.println("버퍼를 사용했을 때 : " + (end - start) + "m/s");
		bis.close();
		fis2.close();
	}

}
