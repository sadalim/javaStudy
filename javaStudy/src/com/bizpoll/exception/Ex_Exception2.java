package com.bizpoll.exception;

public class Ex_Exception2 {
	public static void main(String[] args) {
		int sum =0;
		int cnt = 0;
		
		try {
		for (int i = 0; i < 1000; i++) {
			sum += i;
			cnt++;
			if (sum >= 888) {
				// throws : 메서드의 선언부에서만 작성
				//강제로 예외를 발생시키는 것
			throw new Exception("888 이상이 되었습니다.");
		}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println(cnt);
	}
}