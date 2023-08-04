package com.bizpoll.oop.inheritance;

// super()를 이용한 생성자 접근
// (super()는 부모 클래스의 생성자를 호출하는 명령어, 자식 클래스의 생성자 첫 행에 이 명령어가 있어야 함.
public class Parent2 {
	String name = "홍길순";
	
	public Parent2() {
		System.out.println("부모 이름 : " + name);
	}
}
