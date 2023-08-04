package com.bizpoll.oop.thread;

public class ThreadTestExtendsMain {

	public static void main(String[] args) {
		ThreadTestExtends threadTest = new ThreadTestExtends();
		threadTest.setName("A");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}
	
}
