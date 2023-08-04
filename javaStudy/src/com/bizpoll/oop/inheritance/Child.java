package com.bizpoll.oop.inheritance;

public class Child extends Parent {

	String name = "홍길순";

	public void details() {
		super.details();
		System.out.println(name);
	}

	public void printDetails() {
		details();
		System.out.println("부모 이름 : " + super.name);
		System.out.println("내 이름 : " + name);
	}
}
