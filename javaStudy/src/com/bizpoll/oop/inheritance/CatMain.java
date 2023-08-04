package com.bizpoll.oop.inheritance;

public class CatMain {
	public static void main(String[] args) {
		BabyCat catobj = new BabyCat();
		
		System.out.println("품 종 : " + catobj.bread);
		System.out.println("색 깔 : " + catobj.color);
		
		catobj.eat();
		catobj.meow();
		
	}
}
