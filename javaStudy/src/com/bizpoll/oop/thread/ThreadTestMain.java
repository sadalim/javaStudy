package com.bizpoll.oop.thread;

public class ThreadTestMain {
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
}
