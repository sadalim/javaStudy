package com.bizpoll.oop.thread;

public class ThreadTest implements Runnable {

	@Override
	public void run() { // .run이 아닌 .start로 실행하는 메서드

		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace(); // System.out.println(getMessage()); : 콘솔에 메세지 출력
			}
		}
		
	}

}
