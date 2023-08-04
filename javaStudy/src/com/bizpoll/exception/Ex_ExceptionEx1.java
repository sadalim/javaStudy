package com.bizpoll.exception;

import java.io.FileInputStream;

public class Ex_ExceptionEx1 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[1] = 10; // 1번째의 자리에 10라는 데이터가 위치
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("해당 파일이 존재하지 않습니다.");
		}
	}
}
