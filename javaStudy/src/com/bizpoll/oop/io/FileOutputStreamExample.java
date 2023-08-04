package com.bizpoll.oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {

		String originalFileName = "D:\\Temp\\Dir\\img_copy_sample.png";
		String targetFileName = "D:\\Temp\\Dir\\copy.jpg";
		
		//원본 파일 읽기
		FileInputStream fis = new FileInputStream(originalFileName);
		
		//복사할 위치에 파일 저장
		FileOutputStream fos = new FileOutputStream(targetFileName);
		 int readByteNo;
		 byte[] readBytes = new byte[100];
		 while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		 fos.flush();
		 fos.close();
		 fis.close();
		 
		 System.out.println("복사가 잘 되었습니다.");

	}
}
