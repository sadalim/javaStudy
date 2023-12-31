package com.bizpoll.oop.thread;

public class ThreadTestSynchronized implements Runnable {
	int testNum = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {

			if (Thread.currentThread().getName().equals("A")) {
				System.out.println("=========================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}