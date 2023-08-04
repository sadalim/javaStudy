package com.bizpoll.oop.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {

	public URLConEx() {
		Scanner scanner = new Scanner(System.in);
		String code = null;

		System.out.print("웹 주소를 입력하세요 : ");
		String address = scanner.next();

		try {

			URL url = new URL(address);
			URLConnection con = url.openConnection();
			
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
			FileWriter fw= new FileWriter("D:\\file.html", false);
			
			while ((code = webData.readLine()) != null) {
				
				fw.write(code);
				
			}
		
			System.out.println("The End");
			
			fw.close();
			webData.close();
			
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
