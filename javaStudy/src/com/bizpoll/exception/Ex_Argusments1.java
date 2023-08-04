package com.bizpoll.exception;

public class Ex_Argusments1 {

	public static void main(String[] args) {

		try { // 정상인 동작
			
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
			
			int args1 = Integer.parseInt(args[0]); // 문자열을 정수로 교체 : Integer.parseInt()
			int args2 = Integer.parseInt(args[1]); // 정수를 문자열로 교체 : String.valueof()
			
			System.out.println(args1 + " 더하기 " + args2 +"은 " + (args1 + args2) + "입니다.");
			
		} catch (Exception e) { // 실패했을때 동작(예외처리)
			e.printStackTrace();
			System.out.println("명령행 인수를 입력하세요.");
		} finally { // 성공하던 실패하던 동작, 자원 반납
			System.out.println("처리완료");
		}
	}
//	} 정찬호 멍청이
//	너는 멍청이 야이야 ~~~~~~~~~~~~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	갑갑하니까 키워서 쓰라고 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 
}
