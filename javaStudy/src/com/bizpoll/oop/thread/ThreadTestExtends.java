package com.bizpoll.oop.thread;

public class ThreadTestExtends extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTestExtends");

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
