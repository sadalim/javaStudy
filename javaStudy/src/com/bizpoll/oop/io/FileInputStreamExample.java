package com.bizpoll.oop.io;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D:\\workspace\\eclipse2023-03\\javaStudy0\\src\\com\\bizpoll\\array\\A_Ex_Array1.java");
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
