package com.bizpoll.object;

public class Ex_String {
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = new String("APPLE");

		System.out.println(str1);
		System.out.println(str2);

		// 문자열길이
		System.out.println(str1.length());

		// 대문자로 변경
		System.out.println(str1.toUpperCase());

		// 소문자로 변경
		System.out.println(str2.toLowerCase());

		// 특정 문자만 추출
		System.out.println(str2.substring(1)); // ()부터 끝까지 추출
		System.out.println(str2.substring(2, 4)); // (a,b) a부터 b-a까지 추출

		// 특정 존재여부(존재 : 앞에서 부터 처음 발견되는 인덱스, 실패 : -1)
		int textCheck1 = str1.indexOf("me");
		System.out.println(textCheck1);
		int textCheck2 = str1.indexOf("ppl");
		System.out.println(textCheck2);
		int textCheck3 = str1.indexOf("ppa");
		System.out.println(textCheck3);
		int textCheck4 = str1.indexOf("p");
		System.out.println(textCheck4);

		System.out.println();

		int succ = str1.indexOf("p");
		System.out.println(succ);
		if (succ == -1) {
			System.out.println("검색 실패");
		} else {
			System.out.println("검색 성공");
		}

		// 문자열 분리
		String str3 = "대 : 100@중 : 700@소 : 50";
		String[] splitstr = str3.split("@");
		for (int i = 0; i < splitstr.length; i++) {
			System.out.println(splitstr[i]);
		}

		// 문자열에서 특정 문자 한글자만 출력
		System.out.println();
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		// 문자열 치환
		System.out.println(str2.replaceAll("PP", "@@"));

	}
}
