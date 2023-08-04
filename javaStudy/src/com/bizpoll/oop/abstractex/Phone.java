package com.bizpoll.oop.abstractex;

// 추상 클래스도 일반 클래스와 마찬가지로 멤버 필드, 생성자 선언능 할 수 있다.
// new 연산자로 직접 생성자를 호출할 수 없지만, 자식 객체가 생성될 때 super()를 호출해서 추상 클래스 객체를 생성하므로 추상 클래스도 생성자가 반드시 있어야 한다.
public abstract class Phone {
	// 맴버 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메서드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
