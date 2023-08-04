package com.bizpoll.oop.thread;

public class ThreadTest2Main {

	public static void main(String[] args) {
		ThreadTest2 threadTest0 = new ThreadTest2();
		ThreadTest2 threadTest1 = new ThreadTest2();
		
		Thread thread0 = new Thread(threadTest0, "A");
		Thread thread1 = new Thread(threadTest1, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
	
}
