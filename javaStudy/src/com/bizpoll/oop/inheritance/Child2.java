package com.bizpoll.oop.inheritance;

public class Child2 extends Parent2 {

	String name ="홍길동";
	public Child2() {
		super();
		System.out.println("자식 이름 : " + name);
//		super(); 부모클래스를 불러오는 생성자, 부모가 먼저 나오고 자식이 있을 수 있다.(자식생성자 안에서 부모생성자를 먼저 호출해야한다)
	}
}
