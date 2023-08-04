package com.bizpoll.oop.io;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample4 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("D:/test.txt");

		String data = "안녕 자바 프로그램";

		writer.write(data);
//		writer.write(data, 1, 2);

		writer.flush();
		writer.close();

	}
}
