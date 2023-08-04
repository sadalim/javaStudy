package com.bizpoll.oop.thread;

public class ThreadTest1Main {

	public static void main(String[] args) {
		ThreadTest1 threadTest1 = new ThreadTest1();
		
		Thread thread0 = new Thread(threadTest1, "A");
		Thread thread1 = new Thread(threadTest1, "B");
		
		thread0.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}
	
}
