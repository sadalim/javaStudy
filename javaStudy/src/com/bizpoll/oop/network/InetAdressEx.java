package com.bizpoll.oop.network;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAdressEx {

	Scanner scanner;

	public InetAdressEx() {

		System.out.println("Host 이름을 입력하세요.");
		scanner = new Scanner(System.in);

		try {
//			scanner next(), nextLine()의 차이
//			scanner next() 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자씩 입력 받음.
//			scanner nextLine()문자 또는 문장 한라인 전체를 입력받는다. 문자열의 공백을 포함하여 문자열로 입력 받음.
//			InetAddress inetAddress = InetAddress.getByName(scanner.next());
//			
//			System.out.println("Host Name : " + inetAddress.getHostName());
//			System.out.println("Host IP : " + inetAddress.getHostAddress());
			
			//여러건 출력
			
			InetAddress[] iaArr = InetAddress.getAllByName(scanner.next());
			
			for (int i = 0; i < 4; i++) {
				System.out.println(iaArr[i]);
			}
			for (InetAddress inetAddress2 : iaArr) {
				System.out.println("도메인 : " + inetAddress2.getHostName() + " IP 주소 : " + inetAddress2.getHostAddress());
			}
			
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
